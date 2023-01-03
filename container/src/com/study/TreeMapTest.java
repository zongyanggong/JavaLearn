package com.study;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<Users, String> map = new TreeMap<>();
        Users u1 = new Users("zhangsan", 20);
        Users u2 = new Users("lisi", 18);
        Users u3 = new Users("wangwu", 18);
        Users u4 = new Users("zhangliu", 15);
        map.put(u1, "zhangsan");
        map.put(u2, "lisi");
        map.put(u3, "wangwu");
        map.put(u4, "zhangliu");
        for (Users users : map.keySet()) {
            System.out.println(users + "  " + map.get(users));
        }

        Map<Student, String> map2 = new TreeMap<>(new StudentComparator());
        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 18);
        Student s3 = new Student("wangwu", 18);
        Student s4 = new Student("zhangliu", 15);
        map2.put(s1, "zhangsan");
        map2.put(s2, "lisi");
        map2.put(s3, "wangwu");
        map2.put(s4, "zhangliu");
        for (Student keys : map2.keySet()) {
            System.out.println(keys + "  " + map2.get(keys));
        }
    }
}
