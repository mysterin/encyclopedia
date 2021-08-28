package com.abyss.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class LiveTopicExtendDto implements Serializable {

    protected String id;        /*话题ID*/
    protected String isWhisperOpen;        /*是否打开私问功能*/
    protected String isAuditionOpen;        /*是否打开试听功能：Y打开,N关闭*/
    protected String isSingleBuy;        /*是否打开单节购买功能：Y打开,N关闭*/
    protected String isShareOpen;        /*是否打开分享/分销功能*/
    protected String isAuthOpen;        /*是否展示报名数据头像*/
    protected String isAutoshareOpen;        /*是否打开自动分享/分销功能*/
    protected String isGiftOpen;        /*是否开启礼品赠送*/
    protected java.math.BigDecimal userProfit;        /*私问用户收益比例*/
    protected java.math.BigDecimal platformProfit;        /*平台收益,默认微信2%*/
    protected java.math.BigDecimal topicProfit;        /*直播间获得私问收益比例*/
    protected Short limitEach;        /*用户提问条数限制*/
    protected java.math.BigDecimal questionIncome;        /*提问的总金额*/
    protected java.util.Date updateTime;        /*修改时间*/
    protected String updateBy;        /*修改人*/
    protected String createBy;        /*创建人*/
    protected java.util.Date createTime;        /*创建时间*/
    protected java.math.BigDecimal realIncome;        /*实际话题收入*/
    protected String isDownloadOpen;        /*是否开启下载*/
    protected String isTextOpen;        /*是否打开用户上墙功能，Y打开，N关闭*/
    protected String isAudioOpen;        /*是否打开用户语音发言功能Y打开，N关闭*/
    protected String isOpenAppDownload;   /*是否开启app推广下载Y打开，N关闭*/
    protected String isOptimize;   /*是否忽略优化Y忽略，N没忽略*/
    /**
     * 话题自动分销分成比例
     */
    private Integer percent;

}
