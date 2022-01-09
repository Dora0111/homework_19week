package com.com_02.test_06;

public class MathDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int i=0;i<100000000;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("开始:" + start + "  结束:" + end + "  总耗时" + (end - start)+"毫秒");
    }
}
