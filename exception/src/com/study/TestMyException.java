package com.study;

public class TestMyException {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("zhangsan");
        try {
            person.setAge(-100);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
    }

}

//测试自定义类异常
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException{
        if (age < 0) {
            throw  new IllegalAgeException("人的年龄不应该为负数");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "name is " + name + "and age is " + age;
    }
}
