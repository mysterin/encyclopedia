package com.abyss.dto;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class SimulateChatGroupDto implements Serializable {

	private static final long serialVersionUID = 6725638209527915115L;

	private Long id; 		/*主键*/
	private String name; 		/*名称*/
	private String remark; 		/*备注*/
	private String status; 		/*状态:Y-上线,N-下线*/
	private Integer weight; 		/*权重*/
	private java.util.Date createTime; 		/*创建时间*/
	private java.util.Date updateTime; 		/*更新时间*/

	private List<SimulateChatGroupTagDto> tagDtoList; // 群标签列表
	private String tagNameArray; // 群标签名称列表，分号隔开

	public void setId(Long id){
		this.id = id;
	}
	/**主键*/
	public Long getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	/**名称*/
	public String getName(){
		return this.name;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	/**备注*/
	public String getRemark(){
		return this.remark;
	}
	public void setStatus(String status){
		this.status = status;
	}
	/**状态:Y-上线,N-下线*/
	public String getStatus(){
		return this.status;
	}
	public void setWeight(Integer weight){
		this.weight = weight;
	}
	/**权重*/
	public Integer getWeight(){
		return this.weight;
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

	public List<SimulateChatGroupTagDto> getTagDtoList() {
		return tagDtoList;
	}

	public void setTagDtoList(List<SimulateChatGroupTagDto> tagDtoList) {
		this.tagDtoList = tagDtoList;
	}

	public String getTagNameArray() {
		return tagNameArray;
	}

	public void setTagNameArray(String tagNameArray) {
		this.tagNameArray = tagNameArray;
	}

	/**
	 * @see Object#toString()
	 */
	@Override
	public String toString() 
	{
		return new ToStringBuilder(this)
				.append("id=", this.id)
				.append("name=", this.name)
				.append("remark=", this.remark)
				.append("status=", this.status)
				.append("weight=", this.weight)
				.append("createTime=", this.createTime)
				.append("updateTime=", this.updateTime)
				.append("tagDtoList", this.tagDtoList)
				.append("tagNameArray", this.tagNameArray)
				.toString();
	}
}
