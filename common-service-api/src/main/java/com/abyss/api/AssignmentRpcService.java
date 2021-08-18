package com.abyss.api;

import com.abyss.assignment.dto.AssignmentRecordDto;
import com.abyss.assignment.request.AssignmentRequest;
import com.abyss.base.rpc.Caller;
import com.abyss.base.rpc.RpcResult;
import java.util.List;

public abstract interface AssignmentRpcService
{
    public abstract RpcResult<AssignmentRecordDto> addAssignmentRecord(Caller paramCaller, AssignmentRequest paramAssignmentRequest)
            throws Exception;

    public abstract RpcResult<AssignmentRecordDto> doAssignment(Caller paramCaller, AssignmentRequest paramAssignmentRequest)
            throws Exception;

    public abstract RpcResult<AssignmentRecordDto> getUserAssignment(Caller paramCaller, AssignmentRequest paramAssignmentRequest)
            throws Exception;

    public abstract RpcResult<List<AssignmentRecordDto>> getUnFinishAssignment(Caller paramCaller, AssignmentRequest paramAssignmentRequest)
            throws Exception;

    public abstract RpcResult<List<AssignmentRecordDto>> getAssignmentList(Caller paramCaller, AssignmentRequest paramAssignmentRequest)
            throws Exception;

    public abstract RpcResult<Integer> countUnFinishAssignment(Caller paramCaller, AssignmentRequest paramAssignmentRequest)
            throws Exception;
}
