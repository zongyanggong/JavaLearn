package com.zongyang;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends Frame{

    Image bg = GameUtil.getImage("images/bg.jpg");
    Image plane = GameUtil.getImage("images/plane.png");

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

    @Override
    public void paint(Graphics g) {
        g.drawImage(bg,0,0,500,500,null);
        g.drawImage(plane,200,200,30,30,null);

    }

    public static void main(String[] args) {
        MyGameFrame myGameFrame = new MyGameFrame();
        myGameFrame.launchFrame();
    }


}
