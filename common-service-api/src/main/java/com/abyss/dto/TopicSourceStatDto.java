package com.abyss.dto;

import java.io.Serializable;

public class TopicSourceStatDto implements Serializable {
	
	private static final long serialVersionUID = -7249631075251017436L;
	
	private Long id; 		/*主键*/
	private Long liveId; 		/*直播间id*/
	private Long topicId; 		/*话题id*/
	private String type; 		/*渠道类型:system-系统固定渠道，custom-用户自定义渠道*/
	private String channelNo; 		/*渠道号,qldefault-默认,sharecard-邀请卡,link-分享链接,push-直播间推送,openpush-开放平台推送,liveCenter-直播中心;自定义渠道*/
	private String channelName; 		/*渠道名称*/
	private Integer viewTotal; 		/*独立访客数*/
	private Integer authTotal; 		/*报名人数*/
	private Integer listenTotal; 		/*听课累计人数*/
	private java.util.Date createTime; 		/*创建时间*/
	private java.util.Date updateTime; 		/*更新时间*/

	public void setId(Long id){
		this.id = id;
	}
	/**主键*/
	public Long getId(){
		return this.id;
	}
	public void setLiveId(Long liveId){
		this.liveId = liveId;
	}
	/**直播间id*/
	public Long getLiveId(){
		return this.liveId;
	}
	public void setTopicId(Long topicId){
		this.topicId = topicId;
	}
	/**话题id*/
	public Long getTopicId(){
		return this.topicId;
	}
	public void setType(String type){
		this.type = type;
	}
	/**渠道类型:system-系统固定渠道，custom-用户自定义渠道*/
	public String getType(){
		return this.type;
	}
	public void setChannelNo(String channelNo){
		this.channelNo = channelNo;
	}
	/**渠道号,qldefault-默认,sharecard-邀请卡,link-分享链接,push-直播间推送,openpush-开放平台推送,liveCenter-直播中心;自定义渠道*/
	public String getChannelNo(){
		return this.channelNo;
	}
	public void setChannelName(String channelName){
		this.channelName = channelName;
	}
	/**渠道名称*/
	public String getChannelName(){
		return this.channelName;
	}
	public void setViewTotal(Integer viewTotal){
		this.viewTotal = viewTotal;
	}
	/**独立访客数*/
	public Integer getViewTotal(){
		return this.viewTotal;
	}
	public void setAuthTotal(Integer authTotal){
		this.authTotal = authTotal;
	}
	/**报名人数*/
	public Integer getAuthTotal(){
		return this.authTotal;
	}
	public void setListenTotal(Integer listenTotal){
		this.listenTotal = listenTotal;
	}
	/**听课累计人数*/
	public Integer getListenTotal(){
		return this.listenTotal;
	}
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	/**创建时间*/
	public java.util.Date getCreateTime(){
		return this.createTime;
	}
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
	/**更新时间*/
	public java.util.Date getUpdateTime(){
		return this.updateTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TopicSourceStatDto [id=");
		builder.append(id);
		builder.append(", liveId=");
		builder.append(liveId);
		builder.append(", topicId=");
		builder.append(topicId);
		builder.append(", type=");
		builder.append(type);
		builder.append(", channelNo=");
		builder.append(channelNo);
		builder.append(", channelName=");
		builder.append(channelName);
		builder.append(", viewTotal=");
		builder.append(viewTotal);
		builder.append(", authTotal=");
		builder.append(authTotal);
		builder.append(", listenTotal=");
		builder.append(listenTotal);
		builder.append(", createTime=");
		builder.append(createTime);
		builder.append(", updateTime=");
		builder.append(updateTime);
		builder.append("]");
		return builder.toString();
	}
	
}
