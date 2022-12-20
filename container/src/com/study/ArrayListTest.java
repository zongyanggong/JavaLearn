package com.study;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        //实例化ArrayList容器
        List<String> list = new ArrayList<>();

        //添加元素
        boolean flag = list.add("Admin");
        System.out.println(flag);
        boolean flag2 = list.add("IT");
        System.out.println(flag2);
        //index不能超过arraylist现有元素个数
        list.add(2,"i love");

        //获取元素
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.set(0, "Montreal"));

        System.out.println("-----------------");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.isEmpty());
//        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        System.out.println("-----转换为object数组---------");

        Object[] arr = list.toArray();
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

        System.out.println("-----将单例集合转换指定类型数组---------");
        String[] arr2 = list.toArray(new String[list.size()]);
        for (int i=0;i<arr2.length;i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("------容器的并集操作-----------------");
        List<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        List<String> b = new ArrayList<>();
        b.add("b");
        b.add("c");
        b.add("d");
        System.out.println(a.addAll(b));
        for (String str:a) {
            System.out.println(str);
        }
        System.out.println("---容器的交集操作------");
        a.clear();
        a.add("a");
        a.add("b");
        a.add("c");
        System.out.println(a.retainAll(b));
        for (String str:a) {
            System.out.println(str);
        }
        System.out.println("---容器的差集操作------");
        a.clear();
        a.add("a");
        a.add("b");
        a.add("c");
        System.out.println(a.removeAll(b));
        for (String str:a) {
            System.out.println(str);
        }



    }
}
