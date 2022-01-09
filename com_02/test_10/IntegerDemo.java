package com.com_02.test_10;

public class IntegerDemo {
    public static void main(String[] args) {
        //int 转 String
        int num = 100;
        String s1 = "" + num;
        System.out.println(s1);

        String s2 = String.valueOf(num);
        System.out.println(s2);

        Integer i = Integer.valueOf(s1);
        num = i.intValue();
        System.out.println(num);

        int y = Integer.parseInt(s2);
        System.out.println(y);
    }
}
