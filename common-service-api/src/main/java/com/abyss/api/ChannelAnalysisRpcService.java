package com.abyss.api;

import com.abyss.base.rpc.Caller;
import com.abyss.base.rpc.RpcResult;
import com.abyss.cms.dto.ChannelAnalysisDto;

public interface ChannelAnalysisRpcService {
	
	RpcResult<ChannelAnalysisDto> get (Caller caller, Long channelId);

}
