package com.com_04.test_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExprctionDemo03 {
    public static void main(String[] args) {
        try {
            method2();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    //运行时异常
    public static void method() throws ArrayIndexOutOfBoundsException {

        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);//运行时异常
    }

    public static void method2() throws ParseException {
            String s = "2014-08-09";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);
            System.out.println(d);
    }
}

