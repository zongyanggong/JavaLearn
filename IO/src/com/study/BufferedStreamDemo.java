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
public class BufferedStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try{
            fis = new FileInputStream("./IO/src/com/study/gong.jpg");
            bis = new BufferedInputStream(fis);
            fos = new FileOutputStream("d:/gong.jpg");
            bos = new BufferedOutputStream(fos);
            int temp = 0;
            //缓冲流中的byte数组长度默认为8192
            while ((temp=bis.read()) != -1) {
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
                if (fis != null){
                    fis.close();
                }
                if (bos != null){
                    bos.close();
                }
                if (fos != null){
                    fos.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
