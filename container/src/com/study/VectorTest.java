package com.study;

import java.util.List;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        List<String> v = new Vector<>();
        v.add("a");
        v.add("b");
        v.add("a");
        for (String temp:v)
            System.out.println(temp);
    }
}
