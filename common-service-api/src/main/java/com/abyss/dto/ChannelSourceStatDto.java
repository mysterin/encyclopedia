package com.abyss.dto;

import java.io.Serializable;

public class ChannelSourceStatDto implements Serializable {
	
	private static final long serialVersionUID = 6553209230360174543L;
	
	private Long id; 		/*记录id*/
	private Long liveId; 		/*直播间id*/
	private Long channelId; 		/*系列课id*/
	private String type; 		/*渠道类型:system-系统固定渠道，custom-用户自定义渠道*/
	private String sourceNo; 		/*渠道号,qldefault-默认,sharecard-邀请卡,link-分享链接,push-直播间推送,openpush-开放平台推送,liveCenter-直播中心;自定义渠道*/
	private String sourceName; 		/*渠道名称*/
	private Integer viewTotal; 		/*独立访客数*/
	private Integer authTotal; 		/*报名人数*/
	private java.util.Date createTime; 		/*创建时间*/
	private java.util.Date updateTime; 		/*更新时间*/

	public void setId(Long id){
		this.id = id;
	}
	/**记录id*/
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
	public void setChannelId(Long channelId){
		this.channelId = channelId;
	}
	/**系列课id*/
	public Long getChannelId(){
		return this.channelId;
	}
	public void setType(String type){
		this.type = type;
	}
	/**渠道类型:system-系统固定渠道，custom-用户自定义渠道*/
	public String getType(){
		return this.type;
	}
	public void setSourceNo(String sourceNo){
		this.sourceNo = sourceNo;
	}
	/**渠道号,qldefault-默认,sharecard-邀请卡,link-分享链接,push-直播间推送,openpush-开放平台推送,liveCenter-直播中心;自定义渠道*/
	public String getSourceNo(){
		return this.sourceNo;
	}
	public void setSourceName(String sourceName){
		this.sourceName = sourceName;
	}
	/**渠道名称*/
	public String getSourceName(){
		return this.sourceName;
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
		builder.append("StatChannelSourceTbl [id=");
		builder.append(id);
		builder.append(", liveId=");
		builder.append(liveId);
		builder.append(", channelId=");
		builder.append(channelId);
		builder.append(", type=");
		builder.append(type);
		builder.append(", sourceNo=");
		builder.append(sourceNo);
		builder.append(", sourceName=");
		builder.append(sourceName);
		builder.append(", viewTotal=");
		builder.append(viewTotal);
		builder.append(", authTotal=");
		builder.append(authTotal);
		builder.append(", createTime=");
		builder.append(createTime);
		builder.append(", updateTime=");
		builder.append(updateTime);
		builder.append("]");
		return builder.toString();
	}
	
}
