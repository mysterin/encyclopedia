package com.abyss.api;

import com.abyss.base.rpc.Caller;
import com.abyss.base.rpc.RpcResult;
import com.abyss.cms.dto.TopicAnalysisDto;

public interface TopicAnalysisRpcService {
	
	RpcResult<TopicAnalysisDto> get (Caller caller, Long topicId);

}
