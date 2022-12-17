package com.study;

import java.util.Date;

//测试时间类
public class TestDate {
    public static void main(String[] args) {
        long nowNum = System.currentTimeMillis();
        System.out.println(nowNum);

        Date date1 = new Date();
        System.out.println(date1);

        Date date2 = new Date(-21L*365*24*3600*1000);
        System.out.println(date2);
    }
}
