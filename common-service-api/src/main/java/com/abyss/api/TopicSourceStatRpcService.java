package com.abyss.api;

import com.abyss.base.rpc.Caller;
import com.abyss.base.rpc.RpcResult;
import com.abyss.cms.dto.SourceSumDataDto;
import com.abyss.cms.dto.TopicSourceStatDto;

import java.util.List;
import java.util.Map;

public interface TopicSourceStatRpcService {
	
	/** 新建话题时，初始默认渠道数据 */
	RpcResult<Boolean> initData(Caller caller, Long topicId, Long liveId);
	
	RpcResult<TopicSourceStatDto> create(Caller caller, TopicSourceStatDto dto);
	
	/** 目前只能修改自定义渠道名称*/
	RpcResult<Boolean> update(Caller caller, TopicSourceStatDto dto);
	
	/** 获取某系列课各渠道数据 */
	RpcResult<List<TopicSourceStatDto>> getList(Caller caller, Long topicId, Long liveId);
	
	/** 获取各话题的渠道汇总数据 */
	RpcResult<Map<String, SourceSumDataDto>> sumGroupByTopicId(Caller caller, List<Long> topicIdList);

	RpcResult<List<SourceSumDataDto>> topicStatTopTen(Caller caller, Long liveId);

}
