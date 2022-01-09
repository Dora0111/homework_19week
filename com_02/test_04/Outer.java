package com.com_02.test_04;

public class Outer {
    public void method() {
        Inner i = new Inner() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        i.show();
    }
}
