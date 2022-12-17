package com.study;

import java.util.Random;

public class TestEnum {
    public static void main(String[] args) {
        for (Season s:Season.values()) {
            System.out.println(s);
        }

        int a = new Random().nextInt(4);
        switch (Season.values()[a]) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}

enum Season {
    SPRING,SUMMER,AUTUMN,WINTER
}
