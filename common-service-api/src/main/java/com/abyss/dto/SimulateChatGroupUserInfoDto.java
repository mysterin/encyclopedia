package com.abyss.dto;

import java.io.Serializable;
import java.util.List;

public class SimulateChatGroupUserInfoDto implements Serializable {

    private static final long serialVersionUID = -7235729253665558817L;

    private SimulateChatGroupDto groupDto;
    private List<SimulateChatGroupMsgDto> msgDtoList;
    private List<SimulateChatGroupPersonDto> personDtoList;

    public SimulateChatGroupDto getGroupDto() {
        return groupDto;
    }

    public void setGroupDto(SimulateChatGroupDto groupDto) {
        this.groupDto = groupDto;
    }

    public List<SimulateChatGroupMsgDto> getMsgDtoList() {
        return msgDtoList;
    }

    public void setMsgDtoList(List<SimulateChatGroupMsgDto> msgDtoList) {
        this.msgDtoList = msgDtoList;
    }

    public List<SimulateChatGroupPersonDto> getPersonDtoList() {
        return personDtoList;
    }

    public void setPersonDtoList(List<SimulateChatGroupPersonDto> personDtoList) {
        this.personDtoList = personDtoList;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SimulateChatGroupUserInfoDto{");
        sb.append("groupDto=").append(groupDto);
        sb.append(", msgDtoList=").append(msgDtoList);
        sb.append(", personDtoList=").append(personDtoList);
        sb.append('}');
        return sb.toString();
    }
}
