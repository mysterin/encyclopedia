package com.abyss.api;

import com.abyss.base.rpc.Caller;
import com.abyss.base.rpc.RpcResult;
import com.abyss.community.dto.CommunityIdeaCountDataDto;
import com.abyss.community.dto.CommunityIdeaDto;
import com.abyss.community.dto.CommunityTopicDto;
import com.abyss.community.dto.CommunityUserTagDto;
import com.abyss.community.request.CommunityRequest;

import java.util.List;


public interface CommunityIdeaRpcService {

    /**
     * 保存想法
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Long> addIdea(Caller caller, CommunityRequest request);

    /**
     * 修改想法，目前只做管理后台修改，此方法改不到图片资源
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Boolean> updateIdea(Caller caller, CommunityRequest request);

    /**
     * 删除想法（状态删除）
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Boolean> deleteIdea(Caller caller, CommunityRequest request);

    /**
     * 想法缓存列表
     * @param caller
     * @param request
     * @return
     */
    RpcResult<List<CommunityIdeaDto>> listCacheIdea(Caller caller, CommunityRequest request);




    /**
     * 想法列表
     * @param caller
     * @param request
     * @return
     */
    RpcResult<List<CommunityIdeaDto>> listIdea(Caller caller, CommunityRequest request);

    /**
     * 想法总数
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Integer> countIdea(Caller caller, CommunityRequest request);

    /**
     * 获取想法
     * @param caller
     * @param request
     * @return
     */
    RpcResult<CommunityIdeaDto> getIdea(Caller caller, CommunityRequest request);

    /**
     * 更新想法数量，加进队列
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Boolean> updateIdeaData(Caller caller, CommunityRequest request);

    /**
     * 保存用户标签
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Long> addUserTag(Caller caller, CommunityRequest request);

    /**
     * 修改用户标签
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Boolean> updateUserTag(Caller caller, CommunityRequest request);

    /**
     * 删除用户标签
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Boolean> deleteUserTag(Caller caller, CommunityRequest request);

    /**
     * 想法列表
     * @param caller
     * @param request
     * @return
     */
    RpcResult<List<CommunityUserTagDto>> listUserTag(Caller caller, CommunityRequest request);

    /**
     * 想法列表（缓存）
     * @param caller
     * @param request
     * @return
     */
    RpcResult<List<CommunityUserTagDto>> listCacheUserTag(Caller caller, CommunityRequest request);

    /**
     * 想法总数
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Integer> countUserTag(Caller caller, CommunityRequest request);

    /**
     * 保存话题
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Long> addTopic(Caller caller, CommunityRequest request);

    /**
     * 修改话题
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Boolean> updateTopic(Caller caller, CommunityRequest request);

    /**
     * 删除话题
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Boolean> deleteTopic(Caller caller, CommunityRequest request);

    /**
     * 话题列表
     * @param caller
     * @param request
     * @return
     */
    RpcResult<List<CommunityTopicDto>> listTopic(Caller caller, CommunityRequest request);

    /**
     * 话题列表（缓存）
     * @param caller
     * @param request
     * @return
     */
    RpcResult<List<CommunityTopicDto>> listCacheTopic(Caller caller, CommunityRequest request);


    /**
     * 话题总数
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Integer> countTopic(Caller caller, CommunityRequest request);

    /**
     * 获取话题
     * @param caller
     * @param request
     * @return
     */
    RpcResult<CommunityTopicDto> getTopic(Caller caller, CommunityRequest request);

    /**
     * 更新话题围观数
     */
    RpcResult<Boolean> updateTopicViewNum(Caller caller, Long topicId, Long addNum);

    /**
     * 获取关注的人的信息流
     */
    RpcResult<List<CommunityIdeaDto>> listFocusIdea(String source, Long userId, Integer page, Integer size);

    RpcResult<List<CommunityTopicDto>> listHotTopic();

    RpcResult<CommunityIdeaCountDataDto> loadCountDataOfIdea();

    /**
     * 获取用户想法数量
     *
     * @param request 参数
     * @return 数量
     */
    RpcResult<Integer> countForUserIdea(CommunityRequest request);
}
