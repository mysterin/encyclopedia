package com.abyss.api;

import com.abyss.cms.dto.LiveTopicExtendDto;

import java.util.Map;

public interface TopicMediaRpcService {

    /**
     * 获取音频文件数据
     * @param topicId
     * @return
     */
    Map<String,Object> getAudioInfo(String topicId)  throws Exception ;

    /**
     * 获取话题扩展
     * @param id
     * @return
     */
    LiveTopicExtendDto getTopicExtend(Long id);


    boolean isAuth(String topicId, String userId) throws Exception;
}
