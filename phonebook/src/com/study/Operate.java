package com.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * author:Zongyang Gong
 * Number:2295104
 * date:1/4/2023
 * version:1.0.0
 * description:核心业务类
 */
public class Operate {
    private List<Person> list;

    public Operate() {
        this.list = new ArrayList<>();
    }

    /**
     * 用户添加记录业务逻辑控制
     */
    public void addLogical() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true) {
            menu.addMenu();
            int item = telNoteRegex.menuItemValidate(1, 3);
            switch (item) {
                case 1:
                    this.addOperation();
                    break;
                case 2:
                    this.showAll();
                    break;
                case 3:
                    return;
            }
        }


    }

    /**
     * 用户查询业务逻辑控制
     */
    public void searchLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while(true){
            menu.searchMenu();
            int item = telNoteRegex.menuItemValidate(1,7);
            switch (item){
                case 1:
                    this.searchByName();
                    break;
                case 2:
                    this.searchByAge();
                    break;
                case 3:this.searchBySex();break;
                case 4:this.searchByTelNum();break;
                case 5:this.searchByAdd();break;
                case 6:this.showAll();break;
                case 7:return;
            }
        }

    }

    /**
     * 修改业务逻辑控制
     */
    public void modifyLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while(true){
            menu.modifyMenu();
            int item = telNoteRegex.menuItemValidate(1,3);
            switch (item){
                case 1:
                    this.showAll();
                    break;
                case 2:
                    this.modifyOperation();
                    break;
                case 3:return;
            }
        }
    }

    /**
     * 删除业务逻辑控制
     */
    public void deleteLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while(true){
            menu.deleteMenu();
            int item = telNoteRegex.menuItemValidate(1,4);
            switch (item){
                case 1:
                    this.showAll();
                    break;
                case 2:
                    this.deleteOperation();
                    break;
                case 3:this.deleteAllOperation();break;
                case 4:return;
            }
        }
    }

    /**
     * 排序业务逻辑控制
     */
    public void orderLogic() {
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while(true){
            menu.orderMenu();
            int item = telNoteRegex.menuItemValidate(1,5);
            switch (item){
                case 1:
                    this.orderName();
                    break;
                case 2:
                    this.orderAge();
                    break;
                case 3:this.orderSex();break;
                case 4:this.showAll();break;
                case 5:return;
            }
        }

    }

    /**
     * 添加新记录
     */
    public void addOperation() {
       TelNoteRegex telNoteRegex = new TelNoteRegex();
       String name = telNoteRegex.nameValidate();
       String age = telNoteRegex.ageValidate();
       String sex = telNoteRegex.sexValidate();
       String telNum = telNoteRegex.telNunValidate();
       String address = telNoteRegex.addressValidae();
       Person person = new Person(name,age,sex,telNum,address);
       list.add(person);
       person.setId(list.size());
        System.out.println(person.toString());
    }

    /**
     * 查询全部记录
     */
    public void showAll() {
        if (list.size()==0) {
            System.out.println("电话本没有任何记录");
            return;
        }
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }

    /**
     * 按姓名查询
     */
    public void searchByName() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String name = telNoteRegex.nameValidate();
        boolean flag =true;
        for (int i=0; i<list.size();i++){
            if (name.equals(list.get(i).getName())) {
                System.out.println(list.get(i));
                flag=false;
            }
        }
        if (flag){
            System.out.println("没有找到此人记录！");
        }
    }

    /**
     * 按年龄查询
     */
    public void searchByAge() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String age = telNoteRegex.ageValidate();
        boolean flag =true;
        for (int i=0; i<list.size();i++){
            if (age.equals(list.get(i).getAge())) {
                System.out.println(list.get(i));
                flag=false;
            }
        }
        if (flag){
            System.out.println("没有找到此人记录！");
        }
    }

    /**
     * 按性别查询
     */
    public void searchBySex() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String sex = telNoteRegex.sexValidate();
        boolean flag =true;
        for (int i=0; i<list.size();i++){
            if (sex.equals(list.get(i).getSex())) {
                System.out.println(list.get(i));
                flag=false;
            }
        }
        if (flag){
            System.out.println("没有找到此人记录！");
        }
    }

    /**
     * 按电话号码查询
     */
    public void searchByTelNum() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String telNum = telNoteRegex.telNunValidate();
        boolean flag =true;
        for (int i=0; i<list.size();i++){
            if (telNum.equals(list.get(i).getTelNum())) {
                System.out.println(list.get(i));
                flag=false;
            }
        }
        if (flag){
            System.out.println("没有找到此人记录！");
        }
    }

    /**
     * 按住址查询
     */
    public void searchByAdd() {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String address = telNoteRegex.addressValidae();
        boolean flag =true;
        for (int i=0; i<list.size();i++){
            if (address.equals(list.get(i).getAddress())) {
                System.out.println(list.get(i));
                flag=false;
            }
        }
        if (flag){
            System.out.println("没有找到此人记录！");
        }

    }

    /**
     * 修改指定记录
     */
    public void modifyOperation() {
        if (list.size()==0) {
            System.out.println("当前电话本为空，无法修改");
            return;
        }
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        Menu menu = new Menu();
        System.out.println("请输入记录的序号：");
        int itemNum = telNoteRegex.menuItemValidate(1,list.size());
        menu.subModifyMenu();
        int menuItem = telNoteRegex.menuItemValidate(1,6);
        switch (menuItem) {
            case 1:
                String name = telNoteRegex.nameValidate();
                list.get(itemNum-1).setName(name);
                break;
            case 2:
                String age = telNoteRegex.ageValidate();
                list.get(itemNum-1).setAge(age);
                break;
            case 3:
                String sex = telNoteRegex.sexValidate();
                list.get(itemNum-1).setSex(sex);
                break;
            case 4:
                String telNum = telNoteRegex.telNunValidate();
                list.get(itemNum-1).setSex(telNum);
                break;
            case 5:
                String address = telNoteRegex.addressValidae();
                list.get(itemNum-1).setSex(address);
                break;
            case 6:return;
        }

    }

    /**
     * 删除指定记录
     */
    public void deleteOperation() {
        if (list.size()==0) {
            System.out.println("当前电话本为空，无法修改");
            return;
        }
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        System.out.println("请输入记录的序号：");
        int itemNum = telNoteRegex.menuItemValidate(1,list.size());

        list.remove(itemNum-1);

        //重新为记录设置新的序号
        for (int i=itemNum-1;i<list.size();i++){
            list.get(i).setId(i+1);
        }
        System.out.println("删除成功，请继续操作！");
    }

    /**
     * 删除全部记录
     */
    public void deleteAllOperation() {
        list.clear();
        System.out.println("电话本内容被清空，请继续操作！");
    }

    /**
     * 按名称排序
     */
    public void orderName() {
        Collections.sort(list,new OrderName());
        for (int i=0;i<list.size();i++)
            (list.get(i)).setId(i+1);
    }

    /**
     * 按年龄排序
     */
    public void orderAge() {
        Collections.sort(list,new OrderAge());
        for (int i=0;i<list.size();i++)
            (list.get(i)).setId(i+1);

    }

    /**
     * 按性别排序
     */
    public void orderSex() {
        Collections.sort(list,new OrderSex());
        for (int i=0;i<list.size();i++)
            (list.get(i)).setId(i+1);
    }

    /**
     * 按姓名排序比较器
     */
    class OrderName implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {

            return o1.getName().compareTo(o2.getName());
        }
    }

    /**
     * 按年龄排序比较器
     */
    class OrderAge implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {

            return o1.getAge().compareTo(o2.getAge());
        }
    }

    /**
     * 按性别排序比较器
     */
    class OrderSex implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getSex().compareTo(o2.getSex());
        }
    }

}
