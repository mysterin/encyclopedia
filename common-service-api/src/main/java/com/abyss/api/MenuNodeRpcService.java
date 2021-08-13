package com.abyss.api;

import com.abyss.admin.dto.MenuNodeDto;
import com.abyss.admin.request.MenuNodeRequest;
import com.abyss.base.rpc.Caller;
import com.abyss.base.rpc.RpcResult;
import java.util.List;
import java.util.Map;

public abstract interface MenuNodeRpcService
{
    public abstract RpcResult<List<MenuNodeDto>> listChildren(Caller paramCaller, MenuNodeRequest paramMenuNodeRequest);

    public abstract RpcResult<MenuNodeDto> getMenuNode(Caller paramCaller, MenuNodeRequest paramMenuNodeRequest);

    public abstract RpcResult<MenuNodeDto> getWithChildren(Caller paramCaller, MenuNodeRequest paramMenuNodeRequest);

    public abstract RpcResult<Map<String, List<MenuNodeDto>>> listBatchChildren(Caller paramCaller, MenuNodeRequest paramMenuNodeRequest);
}

