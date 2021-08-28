package com.abyss.dto;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class SimulateChatGroupTagDto implements Serializable {

	private static final long serialVersionUID = 7657756435716442425L;

	private Long id; 		/*主键*/
	private Long groupId; 		/*群id*/
	private String twTag; 		/*推文标签*/

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
	public void setTwTag(String twTag){
		this.twTag = twTag;
	}
	/**推文标签*/
	public String getTwTag(){
		return this.twTag;
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
		.append("twTag=", this.twTag) 
		.toString();
	}
}
