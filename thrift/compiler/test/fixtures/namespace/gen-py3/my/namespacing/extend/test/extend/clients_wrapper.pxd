#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from cpython.ref cimport PyObject
from libc.stdint cimport int8_t, int16_t, int32_t, int64_t
from libcpp cimport bool as cbool
from libcpp.map cimport map as cmap, pair as cpair
from libcpp.memory cimport shared_ptr, unique_ptr
from libcpp.set cimport set as cset
from libcpp.string cimport string
from libcpp.vector cimport vector

from folly cimport cFollyFuture, cFollyTry, cFollyUnit
from thrift.py3.common cimport cRpcOptions

cimport my.namespacing.extend.test.extend.types as _my_namespacing_extend_test_extend_types

cimport hsmodule.types as _hsmodule_types
cimport hsmodule.clients_wrapper as _hsmodule_clients_wrapper

cdef extern from "src/gen-cpp2/ExtendTestService.h" namespace "cpp2":
  cdef cppclass cExtendTestServiceAsyncClient "cpp2::ExtendTestServiceAsyncClient":
      pass

cdef extern from "<utility>" namespace "std":
  cdef unique_ptr[cExtendTestServiceClientWrapper] move(unique_ptr[cExtendTestServiceClientWrapper])

cdef extern from "src/gen-py3/extend/clients_wrapper.h" namespace "cpp2":
  cdef cppclass cExtendTestServiceClientWrapper "cpp2::ExtendTestServiceClientWrapper"(_hsmodule_clients_wrapper.cHsTestServiceClientWrapper):

    cFollyFuture[cbool] check(cRpcOptions, 
      _hsmodule_types.cHsFoo arg_struct1,)

