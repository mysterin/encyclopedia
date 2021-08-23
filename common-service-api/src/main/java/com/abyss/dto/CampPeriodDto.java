package com.abyss.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class CampPeriodDto implements Serializable {

    private Long id; 		/*主键id-期数id*/
    private Long liveId; 		/*直播间id*/
    private Long campId; 		/*训练营id*/
    private Long channelId; 		/*系列课id*/
    private String name; 		/*本期名称*/
    private String status; 		/*状态：Y有效,N无效*/
    private java.util.Date signupEndTime; 		/*报名结束时间*/
    private java.util.Date startTime; 		/*开营时间*/
    private java.util.Date endTime; 		/*结营时间*/
    private Date homeworkTime; 		/*作业统一提交时间*/
    private Integer alertHour; 		/*作业提前提醒小时*/
    private String conventionImage; 		/*学员公约图片url*/
    private String referralLink; 		/*推广链接url*/
    private java.util.Date createTime; 		/*创建时间*/
    private Long createBy; 		/*创建人*/
    private java.util.Date updateTime; 		/*更新时间*/
    private Long updateBy; 		/*更新人*/
    private String needSignIn; 		/*是否开启打卡功能*/
    private Integer affairNum; 		/*共需打卡次数*/
    private String canSupplement; 		/*是否开启补卡功能*/
    private Integer supplementNum; 		/*可补卡次数*/
    private String rewardType; 		/*prize=奖励=语音，refund=全额返*/
    private Integer refundAffairNum; 		/*全额返共需打卡次数*/
    private String refundUrl; 		/*全额返表单地址*/
    private String redirectUrl; 		/*跳转链接*/

    //理财训练营相关
    private String headImg;
    private BigDecimal price;
    private String tryListen;

    //资料完善状态
    private String profileStatus;

    private String hasJoinCamp;

    private String campName;
    private String desc;

}
