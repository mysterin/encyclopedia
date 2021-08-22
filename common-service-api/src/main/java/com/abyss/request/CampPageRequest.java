package com.abyss.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class CampPageRequest implements Serializable {
    private String liveId;
    private String search;
    private String displayStatus;
    private String status;
    private Integer page;
    private Integer pageSize;
}
