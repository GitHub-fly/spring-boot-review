package com.soft1851.springboot.schedule.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xunmi
 * @ClassName QuartzCronDateUtil
 * @Description TODO
 * @Date 2020/5/18
 * @Version 1.0
 **/
public class QuartzCronDateUtil {

    /**
     * 转换日期格式
     * @param date
     * @param dateFormat
     * @return
     */
    public static String formatDateByPattern(Date date, String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        String timeStr = null;
        if (date != null) {
            timeStr = sdf.format(date);
        }
        return timeStr;
    }

    /**
     * 日期转换 cron 表达式时间格式
     * @param date
     * @return
     */
    public static String getCron(Date date) {
        String dateFormat = "ss mm HH dd ? yyyy";
        return formatDateByPattern(date, dateFormat);
    }
}
