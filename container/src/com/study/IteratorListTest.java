package com.study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------------");
        iterator = list.iterator();
        for (;iterator.hasNext();)
            System.out.println(iterator.next());
    }
}
