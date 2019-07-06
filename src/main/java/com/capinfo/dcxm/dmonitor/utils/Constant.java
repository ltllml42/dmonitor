package com.capinfo.dcxm.dmonitor.utils;

public class Constant {

    /**
     * 分页   每页条数。20条
     */
    public static final Integer PAGECOUNT = 20;



    /**
     * 案件数量统计时候用。12345案件
     */
    public static final String TYPE_YESSW = "1";
    /**
     * 案件数量统计时用。96010案件
     */
    public static final String TYPE_RECORD = "2";
    /**
     * 案件数量统计时用。城管系统案件
     */
    public static final String TYPE_CITY = "3";
    /**
     * 案件数量统计时用。已结案案件
     */
    public static final String TYPE_FINISH = "4";
    /**
     * 推送城管系统后未能获取到城管案件编号   5
     */
    public static final String TYPE_CITYNUMBER_WARNING = "5";
    /**
     * 案件快到截止日期     6
     */
    public static final String TYPE_DEADTIME = "6";
    /**
     * 12345接口异常（或者两个小时之内没有数据）
     */
    public static final String TYPE_YESSW_EXCEPTION = "7";


    /**
     * 12345案件状态是结案的    审核回复工单并完成
     */
    public static final String YESSW_STATUS_FINISH = "审核回复工单并完成";

}
