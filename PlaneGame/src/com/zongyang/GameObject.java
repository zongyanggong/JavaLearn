package com.zongyang;

import java.awt.*;

public class GameObject {
    Image img;
    int x, y;
    int speed;
    int width, height;


    public GameObject() {
    }

    public GameObject(Image img, int x, int y, int speed, int width, int height) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public GameObject(Image img, int x, int y, int speed) {
        this(img,x,y);
        this.speed = speed;

    }

    public GameObject(Image img, int x, int y) {
        this(img);
        this.x = x;
        this.y = y;
    }

    public GameObject(Image img) {
        this.img = img;
        if(this.img!=null) {
            this.width = this.img.getWidth(null);
            this.height = this.img.getHeight(null);
        }
    }

    public void drawMySelf(Graphics g){
        g.drawImage(img,x,y,width,height,null);
    }

    public Rectangle getRec() {
        return new Rectangle(x,y,width,height);
    }
}
