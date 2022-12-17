package com.study;

//测试包装类Integer
public class TestInteger {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(20);
        System.out.println(i.toString());
        int j = i.intValue();
        double b = i.doubleValue();
        System.out.println(b);
        int t = Integer.valueOf("456");
        int n = Integer.parseInt("789");
        System.out.println(n);

        //测试自动装箱autoboxing和拆箱unboxing
        Integer x = 100; //编译器 Integer x = Integer.valueOf(100)
        int y = x; //编译器 int y = x.intValue()

        Integer z = null;
        //int z2 = z; //编译器 int z2 = z.intValue()  //NullPointerException

        //测试缓存问题
        //自动装箱时，[-128, 127]之间的有缓存！
        Integer x1 = 100;
        Integer x2 = 100;
        Integer x3 = 1000;
        Integer x4 = 1000;
        System.out.println(x1==x2);
        System.out.println(x3==x4);
        System.out.println(x1.equals(x2));
        System.out.println(x3.equals(x4));

    }

    public static class MyInteger {
    }
}
