package com.abyss.request;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Setter
@Getter
@Accessors(chain = true)
public class TopicProgressRecordRequest implements Serializable {

    private String userId;

    private String topicId;

    private Integer playTime;

}
