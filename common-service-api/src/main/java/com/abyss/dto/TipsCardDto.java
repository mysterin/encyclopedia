package com.abyss.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@ToString
public class TipsCardDto implements Serializable {

    /**
     * ID
     */
    private Long id;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 修改人
     */
    private String updateBy;
    /**
     * 直播间 id
     */
    private String liveId;
    /**
     * 样式 style1=样式1, style2=样式2, custom:自定义
     */
    private String style;
    /**
     * 卡的背景图url
     */
    private String cardUrl;
    /**
     * 跳转链接
     */
    private String url;
    /**
     * 状态：Y-有效，N-无效，D-删除
     */
    private String status;
    /**
     * 拓展json字段
     */
    private String extend;

    /**
     * 话题公示卡状态  UP--上架 DOWN--下架 DELTE--删除
     */
    private String refStatus;

    private String topicId;

    private String imageId;

    /**
     * 状态：Y-有效，N-无效，D-删除
     */
    public enum Status {
        Y("Y"),
        N("N"),
        D("D");

        private String val;

        public String getVal() {
            return val;
        }

        public void setVal(String val) {
            this.val = val;
        }

        Status(String val) {
            this.val = val;
        }
    }
}
