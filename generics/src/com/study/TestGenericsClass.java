package com.study;

public class TestGenericsClass {
    public static void main(String[] args) {
        GenericsClass<String> generics = new GenericsClass<>();
        generics.setFlag("admin");
        String flag = generics.getFlag();
        System.out.println(flag);

        GenericsClass<Integer> generics2 = new GenericsClass<>();
        generics2.setFlag(100);
        Integer flag2 = generics2.getFlag();
        System.out.println(flag2);
    }
}
