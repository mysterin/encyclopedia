package com.abyss.api;

import com.abyss.base.rpc.Caller;
import com.abyss.base.rpc.RpcResult;
import com.abyss.community.dto.CommunityRelationDto;
import com.abyss.community.request.CommunityRelationRequest;

import java.util.List;


public interface CommunityRelationRpcService {

    /**
     * 关注
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Boolean> focus(Caller caller, CommunityRelationRequest request);

    /**
     * 取关
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Boolean> unFocus(Caller caller, CommunityRelationRequest request);

    /**
     * 是否关注
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Boolean> isFocus(Caller caller, CommunityRelationRequest request);

    /**
     * 关注列表
     * @param caller
     * @param request
     * @return
     */
    RpcResult<List<CommunityRelationDto>> listFocus(Caller caller, CommunityRelationRequest request);

    /**
     * 粉丝列表
     * @param caller
     * @param request
     * @return
     */
    RpcResult<List<CommunityRelationDto>> listFans(Caller caller, CommunityRelationRequest request);

    /**
     * 关注数
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Long> countFocus(Caller caller, CommunityRelationRequest request);

    /**
     * 粉丝数
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Long> countFans(Caller caller, CommunityRelationRequest request);

    /**
     * 是否接收通知
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Boolean> isNotify(Caller caller, CommunityRelationRequest request);

    /**
     * 修改通知状态
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Boolean> updateNotifyStatus(Caller caller, CommunityRelationRequest request);

    /**
     * 通知粉丝id列表
     * @param caller
     * @param request
     * @return
     */
    RpcResult<List<Long>> listNotifyFans(Caller caller, CommunityRelationRequest request);
}
