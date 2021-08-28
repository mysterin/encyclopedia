package com.abyss.dto;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ChannelAnalysisDto implements Serializable {
	private static final long serialVersionUID = 6288394876084713617L;
	protected Long id; 		/*系列课id*/
	protected Long payNum; 		/*付费人数*/
	protected Double amount; 		/*门票收入金额*/
	protected Double giftAmount; 		/*赠礼收入金额*/
	protected Long giftPayCount; 		/*赠礼购买数量*/
	protected Long shareRepresentNum; 		/*有效分销课代表数*/
	protected Double shareProfit; 		/*课代表累计分得金额*/
	protected java.util.Date createTime; 		/*创建时间*/
	protected java.util.Date updateTime; 		/*更新时间*/
	protected Long authNum; 		/*报名人数*/

	public void setId(Long id){
		this.id = id;
	}
	/**系列课id*/
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
		map.put("createTime", this.createTime);
		map.put("updateTime", this.updateTime);
		return map;
	}
}
