package com.study;

import java.util.Scanner;

/**
 * author:Zongyang Gong
 * Number:2295104
 * date:1/4/2023
 * version:1.0.0
 * description:数据校验类
 */
public class TelNoteRegex {
    /**
     * 对菜单输入选项的验证
     *
     * @param min
     * @param max
     * @return
     */
    public int menuItemValidate(int min, int max) {
        String regex = "[1-9]{1}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入菜单号，最小是："+min + "\t最大是："+max);
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                int inputNum = Integer.parseInt(input);
                if (inputNum >= min && inputNum <= max) {
                    return inputNum;
                } else {
                    System.out.println("你输入的数字超出了范围，请重新输入！");
                }
            } else {
                System.out.println("输入的不是有效的数字，请重新输入");
            }
        }
    }

    /**
     * 对用户输入姓名的验证
     * 字母可以是大写或者小写，长度1-10
     * @return
     */
    public String nameValidate() {
        String regex = "[a-zA-Z]{1,10}";
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入姓名，格式为1-10之间的大写或小写字母");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            }else {
                System.out.println("您输入的姓名有错误，请重新输入！");
            }
        }
    }

    /**
     * 对用户输入年龄的验证
     * 对年龄的格式要求：10-99
     * @return
     */
    public String ageValidate() {
        String regex = "[1-9]{1}[0-9]{1}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入年龄，格式为10-99之间");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;

            } else  {
                System.out.println("您输入的年龄格式有误，请重新输入！");
            }
        }
    }

    /**
     * 对用户输入性别的验证
     * 对性别的格式要求m M f F
     * @return 大写的字母M 或F
     */
    public String sexValidate() {
        String regex = "[fFmM]{1}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入性别，男(m或M) 女（f或F）");
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input.toUpperCase();
            }else  {
                System.out.println("请输入的性别不合法，请重新输入!");
            }
        }
    }

    /**
     * 对用户输入电话号码验证
     * 对电话号码的要求:运行带有区号的座机号，允许手机号
     * @return
     */
    public String telNunValidate() {
        String regex = "(\\d{3,4}-\\d{7,8})|([1]{1}\\d{10})";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入电话号码，手机号或座机号");
            String input = scanner.nextLine();
            if (input.matches(regex)){
                return input;
            }else {
                System.out.println("输入的电话号码有误，请重新输入");
            }
        }
    }

    /**
     * 对用户输入地址的验证
     * 地址格式要求：字母或者数字，长度1,50
     * @return
     */
    public String addressValidae() {
        String regex = "\\w{1,50}";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入地址，长度1-50的字母或数字");
            String input = scanner.nextLine();
            if (input.matches(regex)){
                return input;
            }else {
                System.out.println("您输入的地址格式有误，请重新输入");
            }
        }
    }

    public static void main(String[] args) {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
//        System.out.println("请输入菜单数字：");
//        System.out.println(telNoteRegex.menuItemValidate(1,7));
//        System.out.println(telNoteRegex.nameValidate());
     //   System.out.println(telNoteRegex.ageValidate());
//        System.out.println(telNoteRegex.sexValidate());
//        System.out.println(telNoteRegex.telNunValidate());
        System.out.println(telNoteRegex.addressValidae());
    }
}
