package com.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// 产生10个[1,10]之间的随机数
public class ListDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        while (list.size()<10) {
            int num = (int)(Math.random()*10+1);
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        for (Integer temp:list) {
            System.out.println(temp);
        }
    }
}
