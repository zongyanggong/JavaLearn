package com.study;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        for (int i=0;i<list.size();i++)
            System.out.println(list.get(i));
        System.out.println("----------------");
        String[] str =  list.toArray(new String[list.size()]);
        for (String temp:str)
            System.out.println(temp);
        System.out.println(list.isEmpty());
        list.add(1,"d");
        for (int i=0;i<list.size();i++)
            System.out.println(list.get(i));
        System.out.println("----Linkedlist------------");


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("a");
        linkedList.addFirst("b");
        linkedList.addFirst("c");
        linkedList.addLast("d");
        for (int i=0;i<linkedList.size();i++)
            System.out.println(linkedList.get(i));
        System.out.println(linkedList.pop());
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.peek());

    }
}
