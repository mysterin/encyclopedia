package com.abyss.request;

import java.io.Serializable;


public class CourseCommonRequest implements Serializable {

    private String bussinessType;

    private Long bussinessId;

    public String getBussinessType() {
        return bussinessType;
    }

    public void setBussinessType(String bussinessType) {
        this.bussinessType = bussinessType;
    }

    public Long getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(Long bussinessId) {
        this.bussinessId = bussinessId;
    }
}
