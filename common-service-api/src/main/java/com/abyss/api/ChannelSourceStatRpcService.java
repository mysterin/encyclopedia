package com.abyss.api;

import com.abyss.base.rpc.Caller;
import com.abyss.base.rpc.RpcResult;
import com.abyss.cms.dto.ChannelSourceStatDto;
import com.abyss.cms.dto.SourceSumDataDto;

import java.util.List;
import java.util.Map;

public interface ChannelSourceStatRpcService {
	
	/** 新建系列课时，初始默认渠道数据 */
	RpcResult<Boolean> initData(Caller caller, Long channelId, Long liveId);
	
	RpcResult<ChannelSourceStatDto> create(Caller caller, ChannelSourceStatDto dto);
	
	/** 目前只能修改自定义渠道名称*/
	RpcResult<Boolean> update(Caller caller, ChannelSourceStatDto dto);
	
	/** 获取某系列课各渠道数据 */
	RpcResult<List<ChannelSourceStatDto>> getList(Caller caller, Long channelId, Long liveId);
	
	/** 获取各系列课的渠道汇总数据 */
	RpcResult<Map<String, SourceSumDataDto>> sumGroupByChannelId(Caller caller, List<Long> channelIdList);


	RpcResult<List<SourceSumDataDto>> channelStatTopTen(Caller caller, Long liveId);



}
