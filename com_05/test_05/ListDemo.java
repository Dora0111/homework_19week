package com.com_05.test_05;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("--------");

        //很少使用向前的遍历-
        while (lit.hasPrevious()) {
            String s = lit.previous();
            System.out.println(s);
        }

        ListIterator<String> litt = list.listIterator();
        while (litt.hasNext()) {
            String s = litt.next();
            if (s.equals("world")) {
                litt.add("javaee");
            }
        }
        System.out.println("--------");
        System.out.println(list);
    }
}
