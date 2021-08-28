package com.abyss.dto;

import java.io.Serializable;
import java.util.Date;

public class InviteFreeReceiveRecordDto implements Serializable {

    private static final long serialVersionUID = -4261892662588520865L;
    private Long id; 		/*主键*/
    private Long shareId; 		/*分享记录id*/
    private Long userId; 		/*领取用户id*/
    private Long channelId; 		/*系列课id*/
    private Long topicId; 		/*系列课下的话题id*/
    private Date createTime; 		/*创建时间*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShareId() {
        return shareId;
    }

    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InviteFreeReceiveRecordDto{");
        sb.append("id=").append(id);
        sb.append(", shareId=").append(shareId);
        sb.append(", userId=").append(userId);
        sb.append(", channelId=").append(channelId);
        sb.append(", topicId=").append(topicId);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }

}
