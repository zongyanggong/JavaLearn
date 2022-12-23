package com.study;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("c");
        set.add("a");
        set.add("b");
        set.add("a");
        for (String str:set){
            System.out.println(str);
        }

        System.out.println("------------------");
        Set<Users> set1 = new TreeSet<>();
        Users u1 = new Users("zhangsan",20);
        Users u2 = new Users("lisi", 18);
        Users u3 = new Users("wangwu",18);
        Users u4 = new Users("zhangliu", 15);
        set1.add(u1);
        set1.add(u2);
        set1.add(u3);
        set1.add(u4);
        for (Users users:set1){
            System.out.println(users);
        }
    }
}
