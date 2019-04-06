package com.fh.zl.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static final String pattern="yyyy-MM-dd";

    public static String date2Str(Date date,String pattern){
        if (date==null){
            return "";
        }
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        String format = sdf.format(date);
        return format;
    }

    public static Date str2Date(String date,String pattern) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        Date parse = sdf.parse(date);
        return parse;
    }
}
