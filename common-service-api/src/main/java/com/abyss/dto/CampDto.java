package com.abyss.dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class CampDto implements Serializable {

    private Long id; 		/*主键-训练营id*/
    private Long liveId; 		/*直播间id*/
    private String name; 		/*训练营名称*/
    private String headImage; 		/*训练营头图*/
    private String status; 		/*Y有效，N无效,D删除*/
    private String isShowAuthNum; 		/*是否展示报名人数*/
    private String isShowPastHomework; 		/*是否展示往期优秀作业*/
    private String isShowHomeworkCircle; 		/*是否展示作业圈子*/
    private Integer periodCount; 		/*总期数*/
    private java.util.Date createTime; 		/**/
    private String createBy; 		/**/
    private java.util.Date updateTime; 		/**/
    private String updateBy; 		/**/
    private String isShowEvaluate; 		/*是否展示用户评价*/
    private String isShowCourse; 		/*是否显示课表*/

    private String desc;

}
