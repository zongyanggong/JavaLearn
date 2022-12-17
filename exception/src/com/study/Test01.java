package com.study;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("111");
        method();
        System.out.println("222");
    }

    public static void method() {
        try {
            int a = 1/ 0;
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
        }
    }
}
