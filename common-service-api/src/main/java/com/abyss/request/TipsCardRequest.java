package com.abyss.request;

import com.abyss.cms.dto.TipsCardDto;
import com.abyss.cms.dto.TipsCardRefDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class TipsCardRequest implements Serializable {

    private Long id;

    private Long userId;

    private String topicId;

    private Long liveId;

    private List<String> liveIdList;

    private String status;

    private int page = 1;

    private int size = 20;

    private TipsCardDto tipsCardDto;

    private TipsCardRefDto tipsCardRefDto;

    private List<TipsCardRefDto> tipsCardRefDtoList;
}
