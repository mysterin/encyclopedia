package com.abyss.dto;

import java.io.Serializable;
import java.util.List;

public class InviteFreeShareInfoDto implements Serializable {

    private static final long serialVersionUID = -5193577393700275781L;
    private Integer total;
    private Integer remaining;
    private String inviteFreeShareId;
    private List<com.qlchat.cms.dto.InviteFreeReceiveRecordDto> userList;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    public String getInviteFreeShareId() {
        return inviteFreeShareId;
    }

    public void setInviteFreeShareId(String inviteFreeShareId) {
        this.inviteFreeShareId = inviteFreeShareId;
    }

    public List<com.qlchat.cms.dto.InviteFreeReceiveRecordDto> getUserList() {
        return userList;
    }

    public void setUserList(List<com.qlchat.cms.dto.InviteFreeReceiveRecordDto> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InviteFreeShareInfoDto{");
        sb.append("total=").append(total);
        sb.append(", remaining=").append(remaining);
        sb.append(", inviteFreeShareId='").append(inviteFreeShareId).append('\'');
        sb.append(", userList=").append(userList);
        sb.append('}');
        return sb.toString();
    }
}
