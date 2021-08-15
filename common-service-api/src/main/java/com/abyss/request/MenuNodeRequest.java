package com.abyss.request;

import java.io.Serializable;
import java.util.List;

public class MenuNodeRequest
        implements Serializable
{
    private String nodeCode;
    private List<String> nodeCodeList;
    private Integer page;
    private Integer size;

    public String getNodeCode()
    {
        return this.nodeCode;
    }

    public void setNodeCode(String nodeCode)
    {
        this.nodeCode = nodeCode;
    }

    public List<String> getNodeCodeList()
    {
        return this.nodeCodeList;
    }

    public void setNodeCodeList(List<String> nodeCodeList)
    {
        this.nodeCodeList = nodeCodeList;
    }

    public Integer getPage()
    {
        return this.page;
    }

    public void setPage(Integer page)
    {
        this.page = page;
    }

    public Integer getSize()
    {
        return this.size;
    }

    public void setSize(Integer size)
    {
        this.size = size;
    }

    public String toString()
    {
        return "MenuNodeRequest{nodeCode='" + this.nodeCode + '\'' + "nodeCodeList='" + this.nodeCodeList + '\'' + ", page=" + this.page + ", size=" + this.size + '}';
    }
}

