package com.study;

/**
 * author:Zongyang Gong
 * Number:2295104
 * date:1/4/2023
 * version:1.0.0
 * description:电话本项目入口类
 */
public class App {


    /**
     * 启动电话本项目
     *
     * @param args
     */
    public static void main(String[] args) {
        App app = new App();
        app.start();

    }

    /**
     * 控制主菜单
     */
    public void start() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        Operate operate = new Operate();
        while (true) {
            menu.mainMenu();
            int item = telNoteRegex.menuItemValidate(1, 6);
            switch (item) {
                case 1: {
                    operate.addLogical();
                    break;
                }
                case 2: {
                    operate.searchLogic();
                    break;
                }
                case 3: {
                    operate.modifyLogic();
                    break;
                }
                case 4: {
                    operate.deleteLogic();
                    break;
                }
                case 5: {
                    operate.orderLogic();
                    break;
                }
                case 6: {
                    System.exit(0);
                }

            }
        }


    }
}
