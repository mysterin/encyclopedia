package com.abyss.constant;


public class CommonConstant {
    /**
     * 操作
     */
    public static class Operate {
        public static final String INSERT = "insert";

        public static final String DELETE = "delete";

        public static final String UPDATE = "update";
    }


    /**
     * redis过期时间单位
     */
    public static final class RedisTimeUnit {

        /**
         * 失效时间 ： 一分
         */
        public static Integer ONE_MINUTE = 60;

        /**
         * 失效时间 ： 一个小时
         */
        public static Integer ONE_HOUR = 60 * 60;

        /**
         * 失效时间 ： 半个小时
         */
        public static Integer HALF_HOUR = 30 * 60;

        /**
         * 失效时间 ：15分钟
         */
        public static Integer QUARTER_HOUR = 15 * 60;

        /**
         * 失效时间 ： 一天
         */
        public static Integer ONE_DAY = ONE_HOUR * 24;

        /**
         * 失效时间 ： 三天
         */
        public static Integer THREE_DAY = ONE_DAY * 3;

        /**
         * 失效时间 ： 一周
         */
        public static Integer ONE_WEEK = ONE_DAY * 7;
        /**
         * 失效时间 ： 半个月
         */
        public static Integer HALF_MONTH = ONE_DAY * 15;

        /**
         * 失效时间 ： 一个月
         */
        public static Integer ONE_MONTH = HALF_MONTH * 2;
    }

    /**
     * 标签类型
     */
    public static final class TagType {
        public static final String CROWD = "CROWD";

        public static final String OTHER_TAG = "OTHER_TAG";
    }

    /**
     * 模拟群聊，真实用户标记
     */
    public static final String REAL_USER_NAME = "#{REAL_USER}#";

    public static class ConfigKey {
        /**
         * 新版会员开始时间
         */
        public static final String NEW_UFW_STUDENT_START_TIME = "NEW_UFW_STUDENT_START_TIME";
        /**
         * 直播间公示卡最大上限
         */
        public static final String TIPS_CARD_MAX_NUM = "TIPS_CARD_MAX_NUM";

        /**
         * 转码成 mp4 模版组 ID
         */
        public static final String TRANSCODE_MP4_TEMPLATE_GROUP_ID = "TRANSCODE_MP4_TEMPLATE_GROUP_ID";
    }


    /**
     * 女性大学分销级别
     */
    public static class UfwUserLevel {
        public static final String LEVEL_A = "LEVEL_A";
        public static final String LEVEL_B = "LEVEL_B";
        public static final String LEVEL_C = "LEVEL_C";
        public static final String LEVEL_D = "LEVEL_D";
        public static final String LEVEL_E = "LEVEL_E";
        public static final String LEVEL_F = "LEVEL_F";
    }


}
