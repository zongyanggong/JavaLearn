package com.study;

public class testGenericsImplement {
    public static void main(String[] args) {
        GenericsImplement generics = new GenericsImplement();
        String name = generics.getName("admin");
        System.out.println(name);

        GenericsInterface<String> generics2 = new GenericsImplement();
        String name2 = generics2.getName("admin2");
        System.out.println(name2);
    }
}
