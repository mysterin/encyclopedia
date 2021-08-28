package com.abyss.dto;

import java.io.Serializable;

public class InviteFreeStatusDto implements Serializable {

    private static final long serialVersionUID = -1890159813807332065L;
    private String isShow;
    private Integer total;
    private Integer receiveCount;

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InviteFreeStatusDto{");
        sb.append("isShow='").append(isShow).append('\'');
        sb.append(", total=").append(total);
        sb.append(", receiveCount=").append(receiveCount);
        sb.append('}');
        return sb.toString();
    }
}
