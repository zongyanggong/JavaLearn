package com.study;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test03 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("d:/d.text");
        char c = (char) reader.read();

    }
}
