package com.study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * author:Zongyang Gong
 * Number:2295104
 * date:1/6/2023
 * version:1.0.0
 * description:
 */
public class CopyFileTool {
    public static void main(String[] args) {
        copyFile("./IO/src/com/study/gong.jpg","d:/gong.jpg");

    }
    private static void copyFile(String src, String des){
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            fis = new FileInputStream(src);
            bis = new BufferedInputStream(fis);
            fos = new FileOutputStream(des);
            bos = new BufferedOutputStream(fos);
            int temp = 0;
            while ((temp = bis.read()) != -1) {
                bos.write(temp);
            }
            bos.flush();

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (bis != null){
                    bis.close();
                }
                if (fis != null) {
                    fis.close();
                }
                if (bos != null) {
                    bos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
