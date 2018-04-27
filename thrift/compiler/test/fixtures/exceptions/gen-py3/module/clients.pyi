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


_RaiserT = _typing.TypeVar('_RaiserT', bound='Raiser')


class Raiser(thrift.py3.client.Client):

    async def __aenter__(self: _RaiserT) -> _RaiserT: ...
    async def __aexit__(
        self,
        exc_type: _typing.Optional[_typing.Type[BaseException]],
        exc: _typing.Optional[BaseException],
        tb: _typing.Optional[TracebackType],
    ) -> _typing.Optional[bool]: ...

    def set_persistent_header(self, key: str, value: str) -> None: ...

    async def doBland(
        self,
        rpc_options: _typing.Optional[thrift.py3.common.RpcOptions]=None
    ) -> None: ...

    async def doRaise(
        self,
        rpc_options: _typing.Optional[thrift.py3.common.RpcOptions]=None
    ) -> None: ...

    async def get200(
        self,
        rpc_options: _typing.Optional[thrift.py3.common.RpcOptions]=None
    ) -> str: ...

    async def get500(
        self,
        rpc_options: _typing.Optional[thrift.py3.common.RpcOptions]=None
    ) -> str: ...

