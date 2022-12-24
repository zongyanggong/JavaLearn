package com.study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator<String> iterator = list.iterator();
        for (;iterator.hasNext();){
            String value = iterator.next();
            if ("c".equals(value)){
                iterator.remove();
            }
        }
        iterator = list.iterator();
        for (;iterator.hasNext();)
            System.out.println(iterator.next());
    }
}
