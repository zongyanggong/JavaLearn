package com.study;

public class GenericsImplement implements GenericsInterface<String>{
    @Override
    public String getName(String name) {
        return name;
    }
}
