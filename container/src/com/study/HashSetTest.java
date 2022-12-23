package com.study;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        //实例化
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b1");
        set.add("c2");
        set.add("d");
        set.add("a");
        //获取元素，Set容器中没有索引，所以没有对应的get(int index)方法
        for (String str:set) {
            System.out.println(str);
        }

        System.out.println(set.remove("c2"));
        for (String str:set) {
            System.out.println(str);
        }
        System.out.println(set.size());

        System.out.println("------------------");
        Set<Users> set1 = new HashSet<>();
        Users u1 = new Users("admin",18);
        Users u2 = new Users("admin", 18);
        set1.add(u1);
        set1.add(u2);
        for (Users user:set1){
            System.out.println(user);
        }
    }
}
