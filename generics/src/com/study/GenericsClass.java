package com.study;

//测试泛型类
public class GenericsClass<T>{
    private T flag;

    public T getFlag() {
        return flag;
    }

    public void setFlag(T flag) {
        this.flag = flag;
    }
}

