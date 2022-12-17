package com.study;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test02 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("D:/a.text");
            char c = (char) reader.read();
            System.out.println(""+c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
