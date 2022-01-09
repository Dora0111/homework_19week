package com.com_04.test_01;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, 10);
        c.add(Calendar.DATE, -5);

        int month = c.get(Calendar.MONTH) + 1;
        int year = c.get(Calendar.YEAR);
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
    }
}
