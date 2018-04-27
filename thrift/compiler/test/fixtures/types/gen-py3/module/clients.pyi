#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

import thrift.py3.types
import thrift.py3.client
import thrift.py3.common
import typing as _typing
from types import TracebackType

import module.types as _module_types
import include.types as _include_types


_SomeServiceT = _typing.TypeVar('_SomeServiceT', bound='SomeService')


class SomeService(thrift.py3.client.Client):

    async def __aenter__(self: _SomeServiceT) -> _SomeServiceT: ...
    async def __aexit__(
        self,
        exc_type: _typing.Optional[_typing.Type[BaseException]],
        exc: _typing.Optional[BaseException],
        tb: _typing.Optional[TracebackType],
    ) -> _typing.Optional[bool]: ...

    def set_persistent_header(self, key: str, value: str) -> None: ...

    async def bounce_map(
        self,
        m: _typing.Mapping[int, str],
        rpc_options: _typing.Optional[thrift.py3.common.RpcOptions]=None
    ) -> _typing.Mapping[int, str]: ...

