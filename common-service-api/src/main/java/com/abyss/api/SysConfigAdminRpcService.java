package com.abyss.api;


import com.abyss.admin.request.SysConfigRequest;
import com.abyss.base.rpc.Caller;
import com.abyss.base.rpc.RpcResult;
import java.util.Map;

public abstract interface SysConfigAdminRpcService
{
    public abstract RpcResult<Map<String, String>> getConfigAllCache(Caller paramCaller, SysConfigRequest paramSysConfigRequest);

    public abstract RpcResult<String> getConfigCache(Caller paramCaller, SysConfigRequest paramSysConfigRequest);
}

