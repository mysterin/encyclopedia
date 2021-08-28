package com.abyss.dto;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class SimulateChatGroupMsgDto implements Serializable {

	private static final long serialVersionUID = -1870396108851881858L;

	private Long id; 		/*主键*/
	private Long groupId; 		/*群id*/
	private Long personId; 		/*群员id*/
	private String contentType; 		/*内容类型*/
	private String content; 		/*内容*/
	private Integer sort; 		/*排序*/

	private String groupName; // 群名称
	private String personName; // 群员名称

	private Object contentObj; // 实际内容的对象

	public void setId(Long id){
		this.id = id;
	}
	/**主键*/
	public Long getId(){
		return this.id;
	}
	public void setGroupId(Long groupId){
		this.groupId = groupId;
	}
	/**群id*/
	public Long getGroupId(){
		return this.groupId;
	}
	public void setPersonId(Long personId){
		this.personId = personId;
	}
	/**群员id*/
	public Long getPersonId(){
		return this.personId;
	}
	public void setContentType(String contentType){
		this.contentType = contentType;
	}
	/**内容类型*/
	public String getContentType(){
		return this.contentType;
	}
	public void setContent(String content){
		this.content = content;
	}
	/**内容*/
	public String getContent(){
		return this.content;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}
	/**排序*/
	public Integer getSort(){
		return this.sort;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Object getContentObj() {
		return contentObj;
	}

	public void setContentObj(Object contentObj) {
		this.contentObj = contentObj;
	}

	/**
	 * @see Object#toString()
	 */
	@Override
	public String toString() 
	{
		return new ToStringBuilder(this)
				.append("id=", this.id)
				.append("groupId=", this.groupId)
				.append("personId=", this.personId)
				.append("contentType=", this.contentType)
				.append("content=", this.content)
				.append("sort=", this.sort)
				.append("groupName=", this.groupName)
				.append("personName=", this.personName)
				.toString();
	}
}
