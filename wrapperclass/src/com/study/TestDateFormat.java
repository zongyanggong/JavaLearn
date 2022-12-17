package com.study;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//test DateFormat
public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str="2049-10-1 10:10:10";
        Date guoqing100 = format.parse(str);
        System.out.println(guoqing100);

        DateFormat format2 = new SimpleDateFormat("D yyyy年MM月dd日 hh时mm分ss秒");
        Date date = new Date();
        System.out.println(format2.format(date));
    }
}
