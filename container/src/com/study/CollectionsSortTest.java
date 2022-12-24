package com.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("b");
        list.add("a");
        list.add("d");
        Collections.sort(list);
        for (String str:list)
            System.out.println(str);

        System.out.println("--------------");
        Collections.shuffle(list);
        for (String str:list)
            System.out.println(str);
    }
}
