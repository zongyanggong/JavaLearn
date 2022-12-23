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

        System.out.println("------------------");
        Set<Student> set2 = new TreeSet<>(new StudentComparator());
        Student s1 = new Student("zhangsan",20);
        Student s2 = new Student("lisi", 18);
        Student s3 = new Student("wangwu",18);
        Student s4 = new Student("zhangliu", 15);
        set2.add(s1);
        set2.add(s2);
        set2.add(s3);
        set2.add(s4);
        for (Student student:set2) {
            System.out.println(student);
        }

    }
}
