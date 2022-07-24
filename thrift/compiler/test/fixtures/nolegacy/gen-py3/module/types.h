/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#pragma once

#include <functional>
#include <folly/Range.h>

#include <thrift/lib/py3/enums.h>
#include "src/gen-cpp2/module_data.h"
#include "src/gen-cpp2/module_types.h"
#include "src/gen-cpp2/module_metadata.h"
namespace thrift {
namespace py3 {


template<>
const std::vector<std::pair<std::string_view, std::string_view>>& PyEnumTraits<
    ::test::fixtures::nolegacy::TestEnum>::namesmap() {
  static const folly::Indestructible<NamesMap> pairs {
    {
    }
  };
  return *pairs;
}


template<>
const std::vector<std::pair<std::string_view, std::string_view>>& PyEnumTraits<
    ::test::fixtures::nolegacy::TestUnion::Type>::namesmap() {
  static const folly::Indestructible<NamesMap> pairs {
    {
    }
  };
  return *pairs;
}


template<>
void reset_field<::test::fixtures::nolegacy::TestError>(
    ::test::fixtures::nolegacy::TestError& obj, uint16_t index) {
  switch (index) {
    case 0:
      obj.test_enum_ref().copy_from(default_inst<::test::fixtures::nolegacy::TestError>().test_enum_ref());
      return;
    case 1:
      obj.code_ref().copy_from(default_inst<::test::fixtures::nolegacy::TestError>().code_ref());
      return;
  }
}

template<>
void reset_field<::test::fixtures::nolegacy::TestMixin>(
    ::test::fixtures::nolegacy::TestMixin& obj, uint16_t index) {
  switch (index) {
    case 0:
      obj.field1_ref().copy_from(default_inst<::test::fixtures::nolegacy::TestMixin>().field1_ref());
      return;
  }
}

template<>
void reset_field<::test::fixtures::nolegacy::TestStruct>(
    ::test::fixtures::nolegacy::TestStruct& obj, uint16_t index) {
  switch (index) {
    case 0:
      obj.bar_ref().copy_from(default_inst<::test::fixtures::nolegacy::TestStruct>().bar_ref());
      return;
    case 1:
      obj.baropt_ref().copy_from(default_inst<::test::fixtures::nolegacy::TestStruct>().baropt_ref());
      return;
    case 2:
      obj.test_error_ref().copy_from(default_inst<::test::fixtures::nolegacy::TestStruct>().test_error_ref());
      return;
    case 3:
      obj.test_mixin_ref().copy_from(default_inst<::test::fixtures::nolegacy::TestStruct>().test_mixin_ref());
      return;
  }
}

template<>
const std::unordered_map<std::string_view, std::string_view>& PyStructTraits<
    ::test::fixtures::nolegacy::TestError>::namesmap() {
  static const folly::Indestructible<NamesMap> map {
    {
    }
  };
  return *map;
}

template<>
const std::unordered_map<std::string_view, std::string_view>& PyStructTraits<
    ::test::fixtures::nolegacy::TestMixin>::namesmap() {
  static const folly::Indestructible<NamesMap> map {
    {
    }
  };
  return *map;
}

template<>
const std::unordered_map<std::string_view, std::string_view>& PyStructTraits<
    ::test::fixtures::nolegacy::TestStruct>::namesmap() {
  static const folly::Indestructible<NamesMap> map {
    {
    }
  };
  return *map;
}

template<>
const std::unordered_map<std::string_view, std::string_view>& PyStructTraits<
    ::test::fixtures::nolegacy::TestUnion>::namesmap() {
  static const folly::Indestructible<NamesMap> map {
    {
    }
  };
  return *map;
}
} // namespace py3
} // namespace thrift
