package com.abyss.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@ToString
public class TipsCardRefDto implements Serializable {

    /**
     * ID
     */
    private Long id;
    /**
     * 公示卡id
     */
    private Long tipsCardId;
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
     * 话题id
     */
    private String topicId;
    /**
     * 状态：up-上架，down-下架，delete-删除
     */
    private String status;

    private TipsCardDto tipsCardDto;

    public enum Status {
        UP("up"),
        DOWN("down"),
        DELETE("delete");

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
