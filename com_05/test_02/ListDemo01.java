package com.com_05.test_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("world");
        list.add("java");
        list.add("world");

        //输出
        System.out.println(list);

        //迭代器的方式遍历
        Iterator<String>it=list.iterator();
        while(it.hasNext()){
            System.out.println();
        }
    }
}

