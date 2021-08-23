package com.abyss.api;

import java.util.List;

public interface LiveCampRpcService {

    RpcResult<List<LiveCampDto>> findLiveCampList(Caller caller, LiveCampPageRequest request);
}
