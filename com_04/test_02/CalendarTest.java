package com.com_04.test_02;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();

        //设置日历对象的年月日
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);
        c.add(Calendar.DATE, -1);

        int date = c.get(Calendar.DATE);

        System.out.println(year + "年的二月份有" + date + "天");
    }
}
