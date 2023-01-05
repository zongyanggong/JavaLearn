package com.study;

/**
 * author:Zongyang Gong
 * Number:2295104
 * date:1/4/2023
 * version:1.0.0
 * description:
 */
public class RegexTest {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9]";
        String content = "b";
        System.out.println(content.matches(regex));

        regex="[^ab]";
        System.out.println(content.matches(regex));
        content = "c";
        System.out.println(content.matches(regex));

        //长度限定符

        regex ="[^ab]?"; //[0,1]
        content = "ce";
        System.out.println(content.matches(regex));

        regex ="[^ab]+"; //[1,]
        content = "ce";
        System.out.println(content.matches(regex));

        regex ="[^ab]*"; //[0,]
        content = "ce";
        System.out.println(content.matches(regex));

        regex ="[a-z]{1}\\w{3,8}";
        content = "c123456789";
        System.out.println(content.matches(regex));
    }
}
