package com.abyss.request;

import java.io.Serializable;

public class SysConfigRequest
        implements Serializable
{
    private String groupCode;
    private String key;

    public String getGroupCode()
    {
        return this.groupCode;
    }

    public void setGroupCode(String groupCode)
    {
        this.groupCode = groupCode;
    }

    public String getKey()
    {
        return this.key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }
}

