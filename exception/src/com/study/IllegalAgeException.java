package com.study;

/**
 * IllegalAgeException:非法年龄异常，继承Exception类
 */
public class IllegalAgeException extends Exception{
    //默认构造器
    public IllegalAgeException() {

    }

    //带有详细信息构造器
    public IllegalAgeException(String message) {super(message);}
}
