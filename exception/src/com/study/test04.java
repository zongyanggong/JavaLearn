package com.study;

import java.io.FileReader;

//use try-with-resource
public class test04 {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("d:/a.txt");) {
            char c = (char) reader.read();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
