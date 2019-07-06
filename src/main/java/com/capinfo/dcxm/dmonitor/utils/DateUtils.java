package com.capinfo.dcxm.dmonitor.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    /**
     * 获取对应天数之前的时间
     * @param date
     * @param days
     * @return
     */
    public static Date getBeforeDate(Date date, int days) {

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, -days);
        Date d = c.getTime();
        return d;
    }

    /**
     * 获取对应天数之后对应几天的时间
     * @param date
     * @param days
     * @return
     */
    public static Date getAfterDate(Date date, int days) {

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, +days);
        Date d = c.getTime();
        return d;
    }



}
