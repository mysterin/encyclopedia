package com.abyss.dto;


import java.io.Serializable;

public class AssignmentProcessDto
        implements Serializable
{
    private static final long serialVersionUID = -1L;
    private Long userId;
    private Integer limitCount;
    private Integer currentCount;
    private String status;
    private String payType;

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

    public String getPayType()
    {
        return this.payType;
    }

    public void setPayType(String payType)
    {
        this.payType = payType;
    }

    public String toString()
    {
        return "AssignmentProcessDto{userId=" + this.userId + ", limitCount=" + this.limitCount + ", currentCount=" + this.currentCount + ", status='" + this.status + '\'' + ", payType='" + this.payType + '\'' + '}';
    }
}

