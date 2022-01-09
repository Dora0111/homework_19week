package com.com_05.test_02;

import java.util.ArrayList;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("world");
        list.add("java");
        list.add("world");

        //指定索引添加
        list.add(1, "javaee");

        //删除指定索引的元素，返回被删除元素
        System.out.println(list.remove(2));

        //修改指定索引的元素，返回被修改的元素
        System.out.println(list.set(0, "javaee"));

        //返回指定索引处的元素
        System.out.println(list.get(1));

        System.out.println("-----------");

        //遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        //输出
        System.out.println(list);
    }
}
