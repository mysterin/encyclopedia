package com.abyss.dto;


import java.io.Serializable;
import java.util.Date;

public class AssignmentRecordDto
        implements Serializable
{
    private static final long serialVersionUID = -1L;
    private Long id;
    private String type;
    private Long businessId;
    private String businessType;
    private Long userId;
    private Integer limitCount;
    private Integer currentCount;
    private String status;
    private String publicField1;
    private String publicField2;
    private String remark;
    private Long createBy;
    private Long updateBy;
    private Date createTime;
    private Date updateTime;

    public Long getId()
    {
        return this.id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getType()
    {
        return this.type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Long getBusinessId()
    {
        return this.businessId;
    }

    public void setBusinessId(Long businessId)
    {
        this.businessId = businessId;
    }

    public String getBusinessType()
    {
        return this.businessType;
    }

    public void setBusinessType(String businessType)
    {
        this.businessType = businessType;
    }

    public Long getUserId()
    {
        return this.userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Integer getLimitCount()
    {
        return this.limitCount;
    }

    public void setLimitCount(Integer limitCount)
    {
        this.limitCount = limitCount;
    }

    public Integer getCurrentCount()
    {
        return this.currentCount;
    }

    public void setCurrentCount(Integer currentCount)
    {
        this.currentCount = currentCount;
    }

    public String getStatus()
    {
        return this.status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getPublicField1()
    {
        return this.publicField1;
    }

    public void setPublicField1(String publicField1)
    {
        this.publicField1 = publicField1;
    }

    public String getPublicField2()
    {
        return this.publicField2;
    }

    public void setPublicField2(String publicField2)
    {
        this.publicField2 = publicField2;
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

    public Long getUpdateBy()
    {
        return this.updateBy;
    }

    public void setUpdateBy(Long updateBy)
    {
        this.updateBy = updateBy;
    }

    public Date getCreateTime()
    {
        return this.createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public Date getUpdateTime()
    {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }

    public String toString()
    {
        return "AssignmentRecordDto{id=" + this.id + ", type='" + this.type + '\'' + ", businessId=" + this.businessId + ", businessType='" + this.businessType + '\'' + ", userId=" + this.userId + ", limitCount=" + this.limitCount + ", currentCount=" + this.currentCount + ", status='" + this.status + '\'' + ", publicField1='" + this.publicField1 + '\'' + ", publicField2='" + this.publicField2 + '\'' + ", remark='" + this.remark + '\'' + ", createBy=" + this.createBy + ", updateBy=" + this.updateBy + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + '}';
    }
}
