package com.study;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        File file = new File(System.getProperty("user.dir"));
        printFile(file, 0);
    }

    public static void printFile(File file, int level) {
        for (int i=0; i<level;i++)
            System.out.print("-");
        System.out.println(file.getName());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File temp:files) {
                printFile(temp, level + 1);
            }
        }
    }
}
