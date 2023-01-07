package com.study;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

/**
 * author:Zongyang Gong
 * Number:2295104
 * date:1/6/2023
 * version:1.0.0
 * description:
 */
public class ListAllFiles {
    private static int level=0;
    public static void listAllFiles(String dir) {
        level++;
        File file=new File(dir);
        String[] fileList = file.list();
        for(String temp:fileList){
            for (int i=0;i<level-1;i++)
                System.out.print("\t");
            System.out.println(temp);
            File subFile = new File(dir + "/" +temp);
            if (subFile.isDirectory())
                listAllFiles(subFile.getAbsolutePath());
        }
        level--;



    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        listAllFiles(System.getProperty("user.dir"));
    }
}
