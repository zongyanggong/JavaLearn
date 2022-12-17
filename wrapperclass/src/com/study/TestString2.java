package com.study;

public class TestString2 {
    public static void main(String[] args) {
        String str = "";
        long num1 = Runtime.getRuntime().freeMemory();
        long time1 =System.currentTimeMillis();
        for (int i=0; i<=5000;i++) {
            str += i;
        }
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 =System.currentTimeMillis();
        System.out.println("String占用内存：" + (num1-num2) );
        System.out.println("String执行时间: " + (time2-time1));
        StringBuilder st1=new StringBuilder("");
        long num3 = Runtime.getRuntime().freeMemory();
        long time3 =System.currentTimeMillis();
        for (int i=0; i<=5000;i++) {
            st1.append(i);
        }
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 =System.currentTimeMillis();
        System.out.println("StringBuilder占用内存：" + (num3-num4) );
        System.out.println("StringBuilder执行时间: " + (time4-time3));
    }
}
