package com.com_03.test_04;

import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        long date = 1000 * 60 * 60;
        Date d2 = new Date();
        System.out.println(d2);

        //创建日期对象
        Date d = new Date();
        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365);

        long time = System.currentTimeMillis();
        d.setTime(time);
        System.out.println(d);

        //--------分割线------------------------------------

    }
}
