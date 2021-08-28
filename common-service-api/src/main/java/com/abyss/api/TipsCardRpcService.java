package com.abyss.api;

import com.abyss.base.rpc.Caller;
import com.abyss.base.rpc.RpcResult;
import com.abyss.cms.dto.TipsCardDto;
import com.abyss.cms.dto.TipsCardRefDto;
import com.abyss.dto.*;
import com.abyss.cms.request.TipsCardRequest;

import java.util.List;

public interface TipsCardRpcService {

    /**
     * 公示卡列表
     * @param caller
     * @param request
     * @return
     */
    RpcResult<PageDto<TipsCardDto>> tipsCardList(Caller caller, TipsCardRequest request);

    /**
     * 新建公示卡
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Long> createTipsCard(Caller caller, TipsCardRequest request);

    /**
     * 删除公示卡
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Boolean> delTipsCard(Caller caller, TipsCardRequest request);

    /**
     * 上架或下架公示卡
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Integer> upOrDownTipsCard(Caller caller, TipsCardRequest request);

    /**
     * 获取话题上架的公示卡
     * @param caller
     * @param request
     * @return
     */
    RpcResult<TipsCardRefDto> getTipsCardByTopicId(Caller caller, TipsCardRequest request);

    /**
     * 获取直播间可用公示卡数量
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Integer> getCardNumByLiveAndY(Caller caller, TipsCardRequest request);


    /**
     * 公示卡对象
     * @param caller
     * @param request
     * @return
     */
    RpcResult<TipsCardDto> loadTipsCardById(Caller caller, TipsCardRequest request);

    /**
     * 获取有关联公示卡的所有课程
     * @param caller
     * @param request
     * @return
     */
    RpcResult<List<TipsCardRefDto>> getCardRefByTipsCardId(Caller caller, TipsCardRequest request);

    /**
     * 下架直播间所有话题公示卡
     * @param caller
     * @param request
     * @return
     */
    RpcResult<Integer> downTipsCardByLiveIds(Caller caller, TipsCardRequest request);

}
