package com.study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        Iterator<String> iterator = set.iterator();
        for (;iterator.hasNext();)
            System.out.println(iterator.next());
        System.out.println("--------------");
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
