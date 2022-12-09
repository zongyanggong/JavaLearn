package com.zongyang;

import java.awt.*;

public class Plane extends GameObject{

    boolean up, down,left,right;
    boolean live = true;
    @Override
    public void drawMySelf(Graphics g) {
        if (!live) {
            return;
        }
        super.drawMySelf(g);

        if (left){
            x -= speed;
            if (x <0) {
                x =0;
            }
        }
        if (right) {
            x +=speed;
            if (x>GameUtil.FRAME_WIDTH-width) {
                x = GameUtil.FRAME_WIDTH-width;
            }
        }
        if (up) {
            y -= speed;
            if (y<30) {
                y = 30;
            }
        }
        if (down) {
            y += speed;
            if (y>=GameUtil.FRAME_HEIGHT-height){
                y = GameUtil.FRAME_HEIGHT-height;
            }
        }

    }

    public Plane(Image img, int x, int y, int speed) {
        super(img, x, y, speed);
    }
}
