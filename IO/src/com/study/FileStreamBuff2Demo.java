package com.study;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * author:Zongyang Gong
 * Number:2295104
 * date:1/6/2023
 * version:1.0.0
 * description:
 */
public class FileStreamBuff2Demo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //创建文件字节输入流对象
            fis = new FileInputStream("./IO/src/com/study/gong.jpg");
            //创建文件字节输出流对象
            fos = new FileOutputStream("d:/gong.jpg");
            //创建一个缓冲器，提高读写效率
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fos.write(buffer);
            //将数据从内存中写入到磁盘中
            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
