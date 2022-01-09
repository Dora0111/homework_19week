package com.com_02.test_01;

/*
  测试类
* */
public class Demo {
    public static void main(String[] args) {
        //创建对象
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("姚明");
        ppp.setAge(56);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();

        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("马龙");
        bp.setAge(22);
        System.out.println(bp.getName() + "," + bp.getAge());
        bp.eat();
        bp.study();
    }
}
