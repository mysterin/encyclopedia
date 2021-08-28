package com.abyss.api;

import com.abyss.base.rpc.Caller;
import com.abyss.base.rpc.RpcResult;
import com.abyss.cms.dto.SimulateChatGroupDto;
import com.abyss.cms.dto.SimulateChatGroupMsgDto;
import com.abyss.cms.dto.SimulateChatGroupPersonDto;
import com.abyss.cms.dto.SimulateChatGroupUserInfoDto;

import java.util.List;
import java.util.Map;

/**
 * 模拟群聊
 */
public interface SimulateChatRpcService {

    /**
     * 获取群列表，admin后台用
     */
    RpcResult<List<SimulateChatGroupDto>> findGroupListByParams(Caller caller, Map<String, Object> params);
    RpcResult<Integer> countGroupByParams(Caller caller, Map<String, Object> params);

    /**
     * 获取群成员列表，admin后台用
     */
    RpcResult<List<SimulateChatGroupPersonDto>> findPersonListByParams(Caller caller, Map<String, Object> params);
    RpcResult<Integer> countPersonByParams(Caller caller, Map<String, Object> params);

    /**
     * 获取群消息列表，admin后台用
     */
    RpcResult<List<SimulateChatGroupMsgDto>> findMsgListByParams(Caller caller, Map<String, Object> params);
    RpcResult<Integer> countMsgByParams(Caller caller, Map<String, Object> params);


    RpcResult<SimulateChatGroupDto> getGroupById(Caller caller, Long id);
    RpcResult<SimulateChatGroupDto> saveGroup(Caller caller, SimulateChatGroupDto groupDto);
    RpcResult<Boolean> deleteGroupById(Caller caller, Long id);

    RpcResult<SimulateChatGroupPersonDto> getPersonById(Caller caller, Long id);
    RpcResult<SimulateChatGroupPersonDto> savePerson(Caller caller, SimulateChatGroupPersonDto personDto);

    RpcResult<SimulateChatGroupMsgDto> getMsgById(Caller caller, Long id);
    RpcResult<SimulateChatGroupMsgDto> saveMsg(Caller caller, SimulateChatGroupMsgDto msgDto);
    RpcResult<Boolean> deleteMsgById(Caller caller, Long id);

    /**
     * 获取用户模拟群聊信息
     */
    RpcResult<SimulateChatGroupUserInfoDto> getUserGroupInfo(Caller caller, String twTag, Long viewTimes, Long toGroupId);

}
