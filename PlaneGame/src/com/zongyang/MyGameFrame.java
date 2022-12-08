package com.zongyang;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static com.zongyang.GameUtil.*;

public class MyGameFrame extends Frame {

    Image bg = GameUtil.getImage("images/bg.jpg");
    Image plane = GameUtil.getImage("images/plane.png");
    int x = 200, y = 200;

    // Init frame
    public void launchFrame() {
        this.setTitle("Plane Game");
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setVisible(true);
        this.setLocation(300, 300);

        //Add frame close event
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }
        });
        new GameThread().run();
    }

    class GameThread extends Thread {
        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(bg, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, null);
        g.drawImage(plane, x, y, 30, 30, null);
        x -= 3;
        y -= 3;
    }

    public static void main(String[] args) {
        MyGameFrame myGameFrame = new MyGameFrame();
        myGameFrame.launchFrame();
    }

    private Image offScreenImage = null;

    @Override
    public void update(Graphics g) {
        if (offScreenImage == null)
            offScreenImage = this.createImage(FRAME_WIDTH, FRAME_HEIGHT);
        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }
}
