package com.zongyang;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import static com.zongyang.GameUtil.*;

public class MyGameFrame extends Frame {

    Image bg = GameUtil.getImage("images/bg.jpg");
    Image planeImg = GameUtil.getImage("images/plane.png");
    int x = 200, y = 200;
    Plane plane = new Plane(planeImg, x, y, 7);
    Shell[] shells= new Shell[50];
    Explode explode;
    Date startTime=new Date();
    Date endTime;
    int peroid;


    public void addDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                plane.left = true;
                break;
            case KeyEvent.VK_RIGHT:
                plane.right = true;
                break;
            case KeyEvent.VK_UP:
                plane.up = true;
                break;
            case KeyEvent.VK_DOWN:
                plane.down = true;
        }
    }

    public void minusDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                plane.left = false;
                break;
            case KeyEvent.VK_RIGHT:
                plane.right = false;
                break;
            case KeyEvent.VK_UP:
                plane.up = false;
                break;
            case KeyEvent.VK_DOWN:
                plane.down = false;
        }
    }

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

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                addDirection(e);

            }

            @Override
            public void keyReleased(KeyEvent e) {
                minusDirection(e);
            }
        });

        for (int i=0;i<shells.length;i++)
            shells[i]=new Shell();
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
        this.plane.drawMySelf(g);
        for (int i=0;i<shells.length;i++) {
            if (shells[i]!=null) {
                shells[i].drawMySelf(g);
                if (plane.live) {
                    boolean peng = shells[i].getRec().intersects(plane.getRec());
                    if (peng){
                        plane.live=false;
                        endTime = new Date();
                        peroid = (int)(endTime.getTime()-startTime.getTime())/1000;

                        if (explode==null) {
                            explode = new Explode(plane.x, plane.y);
                        }
                        explode.draw(g);
                    }
                }

            }

        }
        if (!plane.live) {
            printInfo(g,"Time: "+peroid,20,200,200,Color.white);
        }

    }

    public void printInfo(Graphics g, String str, int size,int x,int y,Color color){
        Font oldFont = g.getFont();
        Color oldColor = g.getColor();
        Font f=new Font("宋体",Font.BOLD,size);
        g.setFont(f);
        g.setColor(color);
        g.drawString(str,x,y);
        g.setColor(oldColor);
        g.setFont(oldFont);
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
