package com.zongyang;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends Frame{

    // Init frame
    public void launchFrame(){
        this.setTitle("Plane Game");
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLocation(300, 300);

        //Add frame close event
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }
        });

    }

    public static void main(String[] args) {
        MyGameFrame myGameFrame = new MyGameFrame();
        myGameFrame.launchFrame();
    }
}
