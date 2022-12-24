package com.study;

import java.util.HashSet;
import java.util.Set;

// 产生10个[1,10]之间的随机数
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        //会造成假排序现象
        while (set.size()<10) {
            int num =(int)(Math.random()*10+1);
            set.add(num);
        }
        for (Integer i:set) {
            System.out.println(i);
        }

    }
}
