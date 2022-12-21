package com.study;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.add("b");
        stack.push("c");
        System.out.println(stack.search("a"));
        for (String str:stack) {
            System.out.println(str);
        }
        System.out.println(stack.peek());
        while (!stack.empty())
            System.out.println(stack.pop());
        System.out.println("----------判断字符串是否对称------------");
        symmetry();
    }

    //判断字符串是否对称
    public static void symmetry() {
        String str = "..(..{..[...]....}..)..";
        boolean flag = true;
        Stack<String> stack = new Stack<>();
        for (int i=0;i<str.length();i++){
            Character c = str.charAt(i);
            if (c == '(') {
                stack.push(")");
            }else if (c == '{'){
                stack.push("}");
            }else if (c == '['){
                stack.push("]");
            } else if (c == ')' || c== '}' || c == ']') {
                if (stack.empty()){
                    flag = false;
                    break;
                };
                if (stack.pop().charAt(0) != c) {
                    flag = false;
                    break;
                }
            }
        }
        if (!stack.empty()){
            flag =false;
        }
        System.out.println(flag);

    }
}
