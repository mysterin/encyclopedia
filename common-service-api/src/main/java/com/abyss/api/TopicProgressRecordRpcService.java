package com.abyss.api;

import com.abyss.base.rpc.RpcResult;
import com.abyss.course.request.TopicProgressRecordRequest;


public interface TopicProgressRecordRpcService {

    /**
     * 缓存用户话题播放进度
     * @return
     */
    RpcResult setTopicProgressRecord(TopicProgressRecordRequest recordRequest) throws Exception;

    /**
     * 保存用户话题播放进度
     * @return
     */
    RpcResult saveTopicProgressRecord() throws Exception;

    /**
     * 获取用户话题播放进度
     * @param recordRequest
     * @return
     */
    RpcResult<Integer> getTopicProgressRecord(TopicProgressRecordRequest recordRequest) throws Exception;

}
