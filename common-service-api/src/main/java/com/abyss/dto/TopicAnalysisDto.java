package com.abyss.dto;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class TopicAnalysisDto implements Serializable {
	private static final long serialVersionUID = -6319217284481174938L;
	protected Long id; 		/*话题id*/
	protected Long payNum; 		/*付费人数*/
	protected Double amount; 		/*门票收入金额*/
	protected Double giftAmount; 		/*赠礼收入金额*/
	protected Long giftPayCount; 		/*赠礼购买数量*/
	protected Long shareRepresentNum; 		/*有效分销课代表数*/
	protected Double shareProfit; 		/*课代表累计分得金额*/
	protected Double rewardAmount; 		/*赞赏总金额*/
	protected Long rewardCount; 		/*赞赏笔数*/
	protected Double rewardLiveProfit; 		/*直播间得到的分成金额*/
	protected Long fileCount; 		/*付费文件购买数*/
	protected Double fileAmount; 		/*付费文件收入*/
	protected Double relayAmount; 		/*转播费收入*/
	protected Double relayProfit; 		/*转播分成收入*/
	protected Double relayBuyerNum; 		/*转播课购买人数*/
	protected Long relayLiveNum; 			/*转播直播间个数*/
	protected java.util.Date createTime; 		/*创建时间*/
	protected java.util.Date updateTime; 		/*更新时间*/
	protected Long authNum; 		/*报名人数*/

	public void setId(Long id){
		this.id = id;
	}
	/**话题id*/
	public Long getId(){
		return this.id;
	}
	public void setPayNum(Long payNum){
		this.payNum = payNum;
	}
	/**付费人数*/
	public Long getPayNum(){
		return this.payNum;
	}
	public void setAmount(Double amount){
		this.amount = amount;
	}
	/**门票收入金额*/
	public Double getAmount(){
		return this.amount;
	}
	public void setGiftAmount(Double giftAmount){
		this.giftAmount = giftAmount;
	}
	/**赠礼收入金额*/
	public Double getGiftAmount(){
		return this.giftAmount;
	}
	public void setGiftPayCount(Long giftPayCount){
		this.giftPayCount = giftPayCount;
	}
	/**赠礼购买数量*/
	public Long getGiftPayCount(){
		return this.giftPayCount;
	}
	public void setShareRepresentNum(Long shareRepresentNum){
		this.shareRepresentNum = shareRepresentNum;
	}
	/**有效分销课代表数*/
	public Long getShareRepresentNum(){
		return this.shareRepresentNum;
	}
	public void setShareProfit(Double shareProfit){
		this.shareProfit = shareProfit;
	}
	/**课代表累计分得金额*/
	public Double getShareProfit(){
		return this.shareProfit;
	}
	public void setRewardAmount(Double rewardAmount){
		this.rewardAmount = rewardAmount;
	}
	/**赞赏总金额*/
	public Double getRewardAmount(){
		return this.rewardAmount;
	}
	public void setRewardCount(Long rewardCount){
		this.rewardCount = rewardCount;
	}
	/**赞赏笔数*/
	public Long getRewardCount(){
		return this.rewardCount;
	}
	public void setRewardLiveProfit(Double rewardLiveProfit){
		this.rewardLiveProfit = rewardLiveProfit;
	}
	/**直播间得到的分成金额*/
	public Double getRewardLiveProfit(){
		return this.rewardLiveProfit;
	}
	public void setFileCount(Long fileCount){
		this.fileCount = fileCount;
	}
	/**付费文件购买数*/
	public Long getFileCount(){
		return this.fileCount;
	}
	public void setFileAmount(Double fileAmount){
		this.fileAmount = fileAmount;
	}
	/**付费文件收入*/
	public Double getFileAmount(){
		return this.fileAmount;
	}
	public void setRelayAmount(Double relayAmount){
		this.relayAmount = relayAmount;
	}
	/**转播费收入*/
	public Double getRelayAmount(){
		return this.relayAmount;
	}
	public void setRelayProfit(Double relayProfit){
		this.relayProfit = relayProfit;
	}
	/**转播分成收入*/
	public Double getRelayProfit(){
		return this.relayProfit;
	}
	public void setRelayBuyerNum(Double relayBuyerNum){
		this.relayBuyerNum = relayBuyerNum;
	}
	/**转播课购买人数*/
	public Double getRelayBuyerNum(){
		return this.relayBuyerNum;
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
	
	public Long getRelayLiveNum() {
		return relayLiveNum;
	}
	public void setRelayLiveNum(Long relayLiveNum) {
		this.relayLiveNum = relayLiveNum;
	}
	
	public Long getAuthNum() {
		return authNum;
	}
	public void setAuthNum(Long authNum) {
		this.authNum = authNum;
	}
	/**
	 * @see Object#toString()
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
		.append("id=", this.id) 
		.append("payNum=", this.payNum) 
		.append("amount=", this.amount) 
		.append("giftAmount=", this.giftAmount) 
		.append("giftPayCount=", this.giftPayCount) 
		.append("shareRepresentNum=", this.shareRepresentNum) 
		.append("shareProfit=", this.shareProfit) 
		.append("rewardAmount=", this.rewardAmount) 
		.append("rewardCount=", this.rewardCount) 
		.append("rewardLiveProfit=", this.rewardLiveProfit) 
		.append("fileCount=", this.fileCount) 
		.append("fileAmount=", this.fileAmount) 
		.append("relayAmount=", this.relayAmount) 
		.append("relayProfit=", this.relayProfit) 
		.append("relayBuyerNum=", this.relayBuyerNum)
		.append("relayLiveNum=", this.relayLiveNum) 
		.append("createTime=", this.createTime) 
		.append("updateTime=", this.updateTime)
		.append("authNum=", this.authNum)
		.toString();
	}
	
	public Map<String,Object> toMap(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", this.id);
		map.put("payNum", this.payNum == null ? 0 : this.payNum);
		map.put("amount", this.amount == null ? 0 : this.amount);
		map.put("authNum", this.authNum == null ? 0 : this.authNum);
		map.put("giftAmount", this.giftAmount == null ? 0 : this.giftAmount);
		map.put("giftPayCount", this.giftPayCount == null ? 0 : this.giftPayCount);
		map.put("shareRepresentNum", this.shareRepresentNum == null ? 0 : this.shareRepresentNum);
		map.put("shareProfit", this.shareProfit == null ? 0 : this.shareProfit);
		map.put("rewardAmount", this.rewardAmount == null ? 0 : this.rewardAmount);
		map.put("rewardCount", this.rewardCount == null ? 0 : this.rewardCount);
		map.put("rewardLiveProfit", this.rewardLiveProfit == null ? 0 : this.rewardLiveProfit);
		map.put("fileCount", this.fileCount == null ? 0 : this.fileCount);
		map.put("fileAmount", this.fileAmount == null ? 0 : this.fileAmount);
		map.put("relayAmount", this.relayAmount == null ? 0 : this.relayAmount);
		map.put("relayProfit", this.relayProfit == null ? 0 : this.relayProfit);
		map.put("relayBuyerNum", this.relayBuyerNum == null ? 0 : this.relayBuyerNum);
		map.put("relayLiveNum", this.relayLiveNum == null ? 0 : this.relayLiveNum);
		map.put("createTime", this.createTime);
		map.put("updateTime", this.updateTime);
		
		return map;
	}
}
