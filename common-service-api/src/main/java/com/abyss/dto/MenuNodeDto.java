package com.abyss.dto;

import com.abyss.wu.dto.ChannelInfoDto;
import com.abyss.wu.dto.LiveEntityInfoDto;
import com.abyss.wu.dto.TopicInfoDto;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MenuNodeDto
        implements Serializable
{
    private Long id;
    private Long parentId;
    private String nodeCode;
    private String title;
    private Long topicId;
    private Long channelId;
    private Long liveId;
    private String status;
    private Integer weight;
    private String keyA;
    private String keyB;
    private String keyC;
    private String keyD;
    private String keyE;
    private String keyF;
    private String keyG;
    private String keyH;
    private String keyI;
    private String keyJ;
    private String keyK;
    private String keyL;
    private Long createBy;
    private Date createTime;
    private Long updateBy;
    private Date updateTime;
    private List<MenuNodeDto> children;
    private TopicInfoDto liveTopicDto;
    private ChannelInfoDto liveChannelDto;
    private LiveEntityInfoDto liveEntityDto;
    private String isJoin;
    private MenuNodeDto node;

    public Long getId()
    {
        return this.id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getParentId()
    {
        return this.parentId;
    }

    public void setParentId(Long parentId)
    {
        this.parentId = parentId;
    }

    public String getNodeCode()
    {
        return this.nodeCode;
    }

    public void setNodeCode(String nodeCode)
    {
        this.nodeCode = nodeCode;
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Long getTopicId()
    {
        return this.topicId;
    }

    public void setTopicId(Long topicId)
    {
        this.topicId = topicId;
    }

    public Long getChannelId()
    {
        return this.channelId;
    }

    public void setChannelId(Long channelId)
    {
        this.channelId = channelId;
    }

    public Long getLiveId()
    {
        return this.liveId;
    }

    public void setLiveId(Long liveId)
    {
        this.liveId = liveId;
    }

    public String getStatus()
    {
        return this.status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public Integer getWeight()
    {
        return this.weight;
    }

    public void setWeight(Integer weight)
    {
        this.weight = weight;
    }

    public String getKeyA()
    {
        return this.keyA;
    }

    public void setKeyA(String keyA)
    {
        this.keyA = keyA;
    }

    public String getKeyB()
    {
        return this.keyB;
    }

    public void setKeyB(String keyB)
    {
        this.keyB = keyB;
    }

    public String getKeyC()
    {
        return this.keyC;
    }

    public void setKeyC(String keyC)
    {
        this.keyC = keyC;
    }

    public String getKeyD()
    {
        return this.keyD;
    }

    public void setKeyD(String keyD)
    {
        this.keyD = keyD;
    }

    public String getKeyE()
    {
        return this.keyE;
    }

    public void setKeyE(String keyE)
    {
        this.keyE = keyE;
    }

    public String getKeyF()
    {
        return this.keyF;
    }

    public void setKeyF(String keyF)
    {
        this.keyF = keyF;
    }

    public String getKeyG()
    {
        return this.keyG;
    }

    public void setKeyG(String keyG)
    {
        this.keyG = keyG;
    }

    public String getKeyH()
    {
        return this.keyH;
    }

    public void setKeyH(String keyH)
    {
        this.keyH = keyH;
    }

    public String getKeyI()
    {
        return this.keyI;
    }

    public void setKeyI(String keyI)
    {
        this.keyI = keyI;
    }

    public String getKeyJ()
    {
        return this.keyJ;
    }

    public void setKeyJ(String keyJ)
    {
        this.keyJ = keyJ;
    }

    public String getKeyK()
    {
        return this.keyK;
    }

    public void setKeyK(String keyK)
    {
        this.keyK = keyK;
    }

    public String getKeyL()
    {
        return this.keyL;
    }

    public void setKeyL(String keyL)
    {
        this.keyL = keyL;
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

    public Long getUpdateBy()
    {
        return this.updateBy;
    }

    public void setUpdateBy(Long updateBy)
    {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime()
    {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }

    public List<MenuNodeDto> getChildren()
    {
        return this.children;
    }

    public void setChildren(List<MenuNodeDto> children)
    {
        this.children = children;
    }

    public TopicInfoDto getLiveTopicDto()
    {
        return this.liveTopicDto;
    }

    public void setLiveTopicDto(TopicInfoDto liveTopicDto)
    {
        this.liveTopicDto = liveTopicDto;
    }

    public ChannelInfoDto getLiveChannelDto()
    {
        return this.liveChannelDto;
    }

    public void setLiveChannelDto(ChannelInfoDto liveChannelDto)
    {
        this.liveChannelDto = liveChannelDto;
    }

    public LiveEntityInfoDto getLiveEntityDto()
    {
        return this.liveEntityDto;
    }

    public void setLiveEntityDto(LiveEntityInfoDto liveEntityDto)
    {
        this.liveEntityDto = liveEntityDto;
    }

    public String getIsJoin()
    {
        return this.isJoin;
    }

    public void setIsJoin(String isJoin)
    {
        this.isJoin = isJoin;
    }

    public MenuNodeDto getNode()
    {
        return this.node;
    }

    public void setNode(MenuNodeDto node)
    {
        this.node = node;
    }

    public String toString()
    {
        return "MenuNodeDto{id=" + this.id + ", parentId=" + this.parentId + ", nodeCode='" + this.nodeCode + '\'' + ", title='" + this.title + '\'' + ", topicId=" + this.topicId + ", channelId=" + this.channelId + ", liveId=" + this.liveId + ", status='" + this.status + '\'' + ", weight=" + this.weight + ", keyA='" + this.keyA + '\'' + ", keyB='" + this.keyB + '\'' + ", keyC='" + this.keyC + '\'' + ", keyD='" + this.keyD + '\'' + ", keyE='" + this.keyE + '\'' + ", keyF='" + this.keyF + '\'' + ", keyG='" + this.keyG + '\'' + ", keyH='" + this.keyH + '\'' + ", keyI='" + this.keyI + '\'' + ", keyJ='" + this.keyJ + '\'' + ", keyK='" + this.keyK + '\'' + ", keyL='" + this.keyL + '\'' + ", createBy=" + this.createBy + ", createTime=" + this.createTime + ", updateBy=" + this.updateBy + ", updateTime=" + this.updateTime + ", children=" + this.children + ", liveTopicDto=" + this.liveTopicDto + ", liveChannelDto=" + this.liveChannelDto + ", liveEntityDto=" + this.liveEntityDto + ", isJoin=" + this.isJoin + ", node=" + this.node + '}';
    }
}

