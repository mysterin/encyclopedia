package com.abyss.api;

public interface CampTopicRpcService {
    RpcResult<Long> getCampIdByTopicId(CampRequest campRequest);
}
