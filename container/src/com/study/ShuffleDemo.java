package com.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 产生10个[1,10]之间的随机数
public class ShuffleDemo {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = Arrays.asList(arr);
        Collections.shuffle(list);
        System.out.println(Arrays.toString(arr));
    }
}
