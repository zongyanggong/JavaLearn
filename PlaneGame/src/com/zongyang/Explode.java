package com.zongyang;

import java.awt.*;

public class Explode extends GameObject{
    double x,y;
    static Image[] images= new Image[16];
    static {
        for (int i=0;i<images.length;i++){
            images[i] = GameUtil.getImage("images/explode/e"+ (i+1) +".gif");
            images[i].getWidth(null);
        }
    }

    int count;
    boolean live = true;
    public void draw(Graphics g) {
        if (!live) {
            return;
        }
        if (count<16) {
            g.drawImage(images[count],(int)x,(int)y,null);
            count++;
        }else {
            live=false;
        }
    }

    public Explode(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
