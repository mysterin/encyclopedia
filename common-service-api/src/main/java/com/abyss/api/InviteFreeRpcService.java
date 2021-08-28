package com.abyss.api;

import com.abyss.base.rpc.Caller;
import com.abyss.base.rpc.RpcResult;
import com.abyss.cms.dto.InviteFreeShareInfoDto;
import com.abyss.cms.dto.InviteFreeStatusDto;

public interface InviteFreeRpcService {

    RpcResult<InviteFreeStatusDto> getShareStatus(Caller caller, String userId, String channelId, String topicId);

    RpcResult<InviteFreeShareInfoDto> getShareInfo(Caller caller, String userId, String topicId);

}
