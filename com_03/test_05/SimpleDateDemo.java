package com.com_03.test_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println("------");

        //从 String 到 Date
        String ss = "2048-08-09 11:11:11";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = null;
        try {
            dd = sdf2.parse(ss);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(dd);
    }
}
