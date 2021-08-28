package com.abyss.dto;

import java.io.Serializable;

public class SourceSumDataDto implements Serializable {
	
	private static final long serialVersionUID = 8963669216808247092L;
	
	private Long businessId; 		/*话题、系列课id*/
	private Integer viewTotal; 		/*独立访客数*/
	private Integer authTotal; 		/*报名人数*/
	
	public Long getBusinessId() {
		return businessId;
	}
	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}
	public Integer getViewTotal() {
		return viewTotal;
	}
	public void setViewTotal(Integer viewTotal) {
		this.viewTotal = viewTotal;
	}
	public Integer getAuthTotal() {
		return authTotal;
	}
	public void setAuthTotal(Integer authTotal) {
		this.authTotal = authTotal;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SourceSumDataDto [businessId=");
		builder.append(businessId);
		builder.append(", viewTotal=");
		builder.append(viewTotal);
		builder.append(", authTotal=");
		builder.append(authTotal);
		builder.append("]");
		return builder.toString();
	}
	
}
