package com.study;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyInteger {
    private final int value;
    private static MyInteger[] cache;
    private static final int LOW = -128;
    private static final int HIGH = 127;

    static {
        cache = new MyInteger[HIGH-LOW+1];
        for (int i=LOW;i<=HIGH;i++) {
            cache[i-LOW] = new MyInteger(i);
        }
        System.out.println(Arrays.toString(cache));
    }

    public MyInteger(int value) {
        this.value = value;
    }


    public static MyInteger valueOf(int value) {
        return new MyInteger(value);
    }

    public int intValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return  ""+value;
    }

    public static void main(String[] args) {
        MyInteger i = new MyInteger(100);
        System.out.println(i.intValue());


    }
}
