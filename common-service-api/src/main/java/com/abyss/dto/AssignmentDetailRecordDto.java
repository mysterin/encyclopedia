package com.abyss.dto;


import java.io.Serializable;
import java.util.Date;

public class AssignmentDetailRecordDto
        implements Serializable
{
    private static final long serialVersionUID = -1L;
    private Long id;
    private Long assignmentRecordId;
    private Long relateId;
    private String publicField1;
    private String remark;
    private Long createBy;
    private Date createTime;

    public Long getId()
    {
        return this.id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getAssignmentRecordId()
    {
        return this.assignmentRecordId;
    }

    public void setAssignmentRecordId(Long assignmentRecordId)
    {
        this.assignmentRecordId = assignmentRecordId;
    }

    public Long getRelateId()
    {
        return this.relateId;
    }

    public void setRelateId(Long relateId)
    {
        this.relateId = relateId;
    }

    public String getPublicField1()
    {
        return this.publicField1;
    }

    public void setPublicField1(String publicField1)
    {
        this.publicField1 = publicField1;
    }

    public String getRemark()
    {
        return this.remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }

    public Long getCreateBy()
    {
        return this.createBy;
    }

    public void setCreateBy(Long createBy)
    {
        this.createBy = createBy;
    }

    public Date getCreateTime()
    {
        return this.createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public String toString()
    {
        return "AssignmentDetailRecordDto{id=" + this.id + ", assignmentRecordId=" + this.assignmentRecordId + ", relateId=" + this.relateId + ", publicField1='" + this.publicField1 + '\'' + ", remark='" + this.remark + '\'' + ", createBy=" + this.createBy + ", createTime=" + this.createTime + '}';
    }
}
