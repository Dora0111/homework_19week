package com.com_04.test_03;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        int[] arr = {1, 2, 3};
//        System.out.println(arr[1]);
//        System.out.println(arr[3]);
//        ArrayIndexOutOfBoundsException
        System.out.println(arr[2]);
    }
}
