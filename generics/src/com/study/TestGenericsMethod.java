package com.study;

public class TestGenericsMethod {
    public static void main(String[] args) {
        GenericsMethod genericsMethod = new GenericsMethod();
        genericsMethod.setName("admin");
        genericsMethod.setName(123);

        String name = genericsMethod.getName("admin");
        System.out.println(name);
        Integer name1 = genericsMethod.getName(456);
        System.out.println(name1);

        GenericsMethod.setFlag("admin2");
        GenericsMethod.setFlag(1234);

        System.out.println(GenericsMethod.getFlag("admin3"));
        System.out.println(GenericsMethod.getFlag(123454));

        String[] attr = new String[] {"a", "b", "c"};
        genericsMethod.method(attr);
        Integer[] attr2 = new Integer[] {1,2,3,4};
        genericsMethod.method(attr2);

    }
}
