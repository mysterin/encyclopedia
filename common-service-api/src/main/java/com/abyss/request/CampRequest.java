package com.abyss.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@ToString
@Accessors(chain = true)
public class CampRequest implements Serializable {
    private String topicId;

    private Long id;

    private Long channelId;

    private List<Long> campIds;

    private Long userId;
}
