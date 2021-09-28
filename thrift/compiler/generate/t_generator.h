/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef T_GENERATOR_H
#define T_GENERATOR_H

#include <fstream>
#include <iostream>
#include <sstream>
#include <string>
#include <unordered_set>

#include <thrift/compiler/ast/t_program.h>
#include <thrift/compiler/common.h>
#include <thrift/compiler/validator/validator.h>

namespace apache {
namespace thrift {
namespace compiler {

class t_generation_context {
 public:
  t_generation_context() : out_path_("./"), is_out_path_absolute_(false) {}

  t_generation_context(std::string out_path, bool is_out_path_absolute)
      : out_path_(std::move(out_path)),
        is_out_path_absolute_(is_out_path_absolute) {
    if (!out_path_.empty()) {
      if (!(out_path_.back() == '/' || out_path_.back() == '\\')) {
        out_path_.push_back('/');
      }
    }
  }

  const std::string& get_out_path() const { return out_path_; }

  bool is_out_path_absolute() const { return is_out_path_absolute_; }

 private:
  std::string out_path_;
  bool is_out_path_absolute_;
};

class t_generator {
 public:
  explicit t_generator(t_program* program, t_generation_context context)
      : program_(program), context_(std::move(context)) {
    this->program_name_ = this->get_program_name(this->program_);
  }

  virtual ~t_generator() = default;

  virtual void fill_validator_list(validator_list&) const {}

  // Generate the program. Overridden by subclasses to implement program
  // generation.
  virtual void generate_program() = 0;

  /**
   * Method to get the program name, may be overridden
   */
  virtual std::string get_program_name(t_program* program) {
    return program->name();
  }

  const t_program* get_program(void) const { return this->program_; }

  std::unordered_set<std::string> get_genfiles() { return generated_files; }

  void record_genfile(const std::string& filename) {
    generated_files.insert(filename);
  }

  /**
   * Get the current output directory
   */
  virtual std::string get_out_dir() const {
    if (context_.is_out_path_absolute()) {
      return context_.get_out_path() + "/";
    }

    return context_.get_out_path() + out_dir_base_ + "/";
  }

 protected:
  t_program* program_;

  t_generation_context context_;

  /**
   * Output type-specifc directory name ("gen-*")
   */
  std::string out_dir_base_;

  /**
   * Quick accessor for formatted program name that is currently being
   * generated.
   */
  std::string program_name_;

  /**
   * The set of files generated by this generator.
   */
  std::unordered_set<std::string> generated_files;
};

/**
 * A factory for producing generator classes of a particular language.
 *
 * This class is also responsible for:
 *  - Registering itself with the generator registry.
 *  - Providing documentation for the generators it produces.
 */
class t_generator_factory {
 public:
  t_generator_factory(
      const std::string& short_name,
      const std::string& long_name,
      const std::string& documentation);

  virtual ~t_generator_factory() = default;

  virtual t_generator* get_generator(
      // The program to generate.
      t_program* program,
      t_generation_context context,
      // Note: parsed_options will not exist beyond the call to get_generator.
      const std::map<std::string, std::string>& parsed_options,
      // Note: option_string might not exist beyond the call to get_generator.
      const std::string& option_string) = 0;

  std::string get_short_name() { return short_name_; }
  std::string get_long_name() { return long_name_; }
  std::string get_documentation() { return documentation_; }

 private:
  std::string short_name_;
  std::string long_name_;
  std::string documentation_;
};

class t_name_generator {
 public:
  t_name_generator() {}

  std::string operator()() { return operator()("tmp_"); }

  std::string operator()(const char* prefix) {
    std::ostringstream out;
    out << prefix << counter_++;
    return out.str();
  }

 private:
  int counter_{0};
};

template <typename generator>
class t_generator_factory_impl : public t_generator_factory {
 public:
  t_generator_factory_impl(
      const std::string& short_name,
      const std::string& long_name,
      const std::string& documentation)
      : t_generator_factory(short_name, long_name, documentation) {}

  t_generator* get_generator(
      t_program* program,
      t_generation_context context,
      const std::map<std::string, std::string>& parsed_options,
      const std::string& option_string) override {
    return new generator(program, context, parsed_options, option_string);
  }
};

class t_generator_registry {
 public:
  static void register_generator(t_generator_factory* factory);

  static t_generator* get_generator(
      t_program* program,
      t_generation_context context,
      const std::string& options);

  typedef std::map<std::string, t_generator_factory*> gen_map_t;
  static gen_map_t& get_generator_map();

 private:
  t_generator_registry();
  t_generator_registry(const t_generator_registry&);
};

#define THRIFT_REGISTER_GENERATOR(language, long_name, doc)         \
  class t_##language##_generator_factory_impl                       \
      : public t_generator_factory_impl<t_##language##_generator> { \
   public:                                                          \
    t_##language##_generator_factory_impl()                         \
        : t_generator_factory_impl<t_##language##_generator>(       \
              #language, long_name, doc) {}                         \
  };                                                                \
  static t_##language##_generator_factory_impl _registerer

} // namespace compiler
} // namespace thrift
} // namespace apache

#endif // T_GENERATOR_H
