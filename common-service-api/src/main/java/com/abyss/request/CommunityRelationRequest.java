package com.abyss.request;

import com.abyss.community.dto.CommunityRelationDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Getter
@Setter
@ToString
@Accessors(chain = true)
public class CommunityRelationRequest implements Serializable {

    private Long id;

    private Long followId;

    private Long followerId;

    private String source;

    private int page = 1;

    private int size = 20;

    private CommunityRelationDto communityRelationDto;

}
