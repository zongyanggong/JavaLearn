package com.study;

public class TestGenericsBounds {
    public static void main(String[] args) {
        ShowMsg showMsg=new ShowMsg();
        GenericsClass<Integer> generics = new GenericsClass();
        generics.setFlag(100);
        showMsg.showFlagNoBounds(generics);
        showMsg.showFlagUperBounds(generics);
//        showMsg.showFlagLowBounds(generics); //exception:low bound is number
        GenericsClass<Number> generics1 = new GenericsClass();
        generics1.setFlag(200);
        showMsg.showFlagNoBounds(generics1);
        //        showMsg.showFlagUperBounds(generics1); //super bound is Integer
        showMsg.showFlagLowBounds(generics1);
        GenericsClass<String> generics2 = new GenericsClass();
        generics2.setFlag("admin");
        showMsg.showFlagNoBounds(generics2);
//        showMsg.showFlagUperBounds(generics2); //exception:super bound is Integer
//        showMsg.showFlagLowBounds(generics2);//exception:low bound is number





    }
}
