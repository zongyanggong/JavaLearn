package com.zongyang;

import java.awt.*;

public class Shell extends GameObject {
    public double degree;

    public Shell() {
        this.degree = Math.random()*2*Math.PI;
        x = 100;
        y = 100;
        width=10;
        height=10;
        speed = 7;
    }

    @Override
    public void drawMySelf(Graphics g) {
        Color oldColor = g.getColor();
        g.setColor(Color.yellow);
        g.fillOval(x,y,width,height);
        g.setColor(oldColor);
        x += speed*Math.cos(degree);
        y += speed* Math.sin(degree);
        if ((y > GameUtil.FRAME_HEIGHT - height) || (y < 30)) {
            degree = -degree;
        }
        if ((x > GameUtil.FRAME_WIDTH - width) || (x < 0)) {
            degree = Math.PI-degree;
        }
    }
}
