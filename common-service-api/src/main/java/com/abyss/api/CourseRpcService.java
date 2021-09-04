package com.abyss.api;

import com.abyss.base.rpc.Caller;
import com.abyss.base.rpc.RpcResult;
import com.abyss.course.request.CourseCommonRequest;

import java.math.BigDecimal;


public interface CourseRpcService {

    RpcResult<BigDecimal> getCoursePrice(Caller caller, CourseCommonRequest request);
}
