package com.study;

public class ShowMsg {
    public void showFlagNoBounds(GenericsClass<?> generics) {
        System.out.println(generics.getFlag());
    }
    public void showFlagUperBounds(GenericsClass<? extends Integer> generics) {
        System.out.println(generics.getFlag());
    }
    public void showFlagLowBounds(GenericsClass<? super Number> generics) {
        System.out.println(generics.getFlag());
    }
}
