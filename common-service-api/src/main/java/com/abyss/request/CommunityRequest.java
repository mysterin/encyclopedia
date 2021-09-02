package com.abyss.request;

import com.abyss.community.dto.CommunityIdeaDto;
import com.abyss.community.dto.CommunityIdeaResourceDto;
import com.abyss.community.dto.CommunityTopicDto;
import com.abyss.community.dto.CommunityUserTagDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Map;


@Getter
@Setter
@ToString
@Accessors(chain = true)
public class CommunityRequest implements Serializable {

    private Long id;

    private Long userId;

    private Long topicId;

    private String source;

    private int addNum;

    private int page = 1;

    private int size = 20;

    private String selected;

    private CommunityIdeaDto communityIdeaDto;

    private CommunityIdeaResourceDto communityIdeaResourceDto;

    private CommunityTopicDto communityTopicDto;

    private CommunityUserTagDto communityUserTagDto;

    private Map<String, String> data;

}
