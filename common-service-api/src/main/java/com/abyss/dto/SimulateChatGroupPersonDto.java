package com.abyss.dto;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class SimulateChatGroupPersonDto implements Serializable {

	private static final long serialVersionUID = -4123326901879551256L;

	private Long id; 		/*主键*/
	private Long groupId; 		/*群id*/
	private String name; 		/*昵称*/
	private String headImg; 		/*头像url*/

	private String groupName; // 群名称

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
	public void setName(String name){
		this.name = name;
	}
	/**昵称*/
	public String getName(){
		return this.name;
	}
	public void setHeadImg(String headImg){
		this.headImg = headImg;
	}
	/**头像url*/
	public String getHeadImg(){
		return this.headImg;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
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
				.append("name=", this.name)
				.append("headImg=", this.headImg)
				.append("groupName=", this.groupName)
				.toString();
	}
}
