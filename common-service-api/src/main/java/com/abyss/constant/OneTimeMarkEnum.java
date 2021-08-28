package com.abyss.constant;


public enum OneTimeMarkEnum {

    /**
     * 女子大学录取通知页
     */
    UNIVERSITY_AUTH_PAGE("UNIVERSITY_AUTH_PAGE", 0, 1 << 0),

    /**
     * 女子大学班级二维码条
     */
    UNIVERSITY_CLASS_QRCODE("UNIVERSITY_CLASS_QRCODE", 1, 1 << 1),
    /**
     * 女子大学社区
     */
    UNIVERSITY_COMMUNITY("UNIVERSITY_COMMUNITY", 2, 1 << 2),
    ;

    /**
     * 业务类型
     */
    private String type;

    /**
     * 下标，从0开始到62
     */
    private int index;

    /**
     * 01 10 11 100
     * 下标对应的二进制数，比如第3位，对应的二进制数 100，十进制数是  4 = 2 * 2，以此类推
     * 这个数会用来设置和获取当前下标的值，和index的关系是  powerNum = 2的index次方
     *
     * 这里用左移来表示，1左移index就是powerNum的值
     */
    private long powerNum;

    OneTimeMarkEnum(String type, int index, long powerNum) {
        this.type = type;
        this.index = index;
        this.powerNum = powerNum;
    }

    public String getType() {
        return type;
    }

    public int getIndex() {
        return index;
    }

    public long getPowerNum() {
        return powerNum;
    }

    public static OneTimeMarkEnum getByType(String type){
        if (type == null || "".equals(type)){
            return null;
        }

        OneTimeMarkEnum[] values = OneTimeMarkEnum.values();
        for (OneTimeMarkEnum value : values) {
            if (value.getType().equals(type)){
                return value;
            }
        }

        return null;
    }

}
