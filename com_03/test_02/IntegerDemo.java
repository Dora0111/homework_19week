package com.com_03.test_02;

public class IntegerDemo {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(100);
        Integer ii = 100;//自动装箱 底层自动装箱

        //拆箱
        //ii += 200
        ii = ii.intValue() + 200;
        ii += 200;
        System.out.println(ii);

        Integer iii = null;
        if (iii != null) {
            iii += 300;
        }
    }
}
