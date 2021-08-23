package com.abyss.api;


import com.base.rpc.Caller;
import com.base.rpc.RpcResult;
import com.camp.dto.CampDto;
import com.camp.dto.CampPeriodDto;
import com.camp.request.CampPageRequest;
import com.camp.request.CampRequest;

import java.util.List;


public interface CampRpcService {

    RpcResult<Long> getPeriodIdByTopicId(CampRequest campRequest);

    RpcResult<CampDto> getCampById(CampRequest campRequest);

    RpcResult<CampPeriodDto> getCampPrtiodByChannelId(CampRequest campRequest);

    /**
     * 根据campIds获取用户报名期数
     * @param caller
     * @param campRequest
     * @return
     */
    RpcResult<List<CampPeriodDto>> listUserPeriodByCampIds(Caller caller, CampRequest campRequest);

    /**
     * 根据campIds获取可用期数
     * @param campRequest
     * @return
     */
    RpcResult<List<CampPeriodDto>> listPeriodByCampIds(Caller caller, CampRequest campRequest);

    RpcResult<List<CampDto>> findCampList(Caller caller, CampPageRequest request);

