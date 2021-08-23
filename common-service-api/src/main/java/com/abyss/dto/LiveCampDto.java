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
public class LiveCampDto implements Serializable {
    private String id; 		/*训练营id*/
    private String headImage; 		/*训练营头图*/
    private String name; 		/*训练营名称*/
    private String liveId; 		/*直播间id*/
    private Date startTime; 		/*开始时间*/
    private Date endTime; 		/*结束时间*/
    private Integer dayNum; 		/*总天数*/
    private BigDecimal price; 		/*价格（分）*/
    private String bonusStatus; 		/*Y开启契约金，N关闭契约金*/
    private Integer bonusPercent; 		/*比例*/
    private BigDecimal bonusPoolMoney; 		/*奖金池金额*/
    private Integer receiveDayNum; 		/*领取条件天数*/
    private String status; 		/*Y有效，N无效*/
    private Integer authNum; 		/*报名人数*/
    private Integer allAffairCount; 		/*总打卡次数*/
    private Integer sortWeight; 		/*排序权重*/
    private String displayStatus; 		/*Y显示，N隐藏*/
    private Date createTime; 		/**/
    private String createBy; 		/**/
    private Date updateTime; 		/**/
    private String updateBy; 		/**/
    private String campStatus;
}
