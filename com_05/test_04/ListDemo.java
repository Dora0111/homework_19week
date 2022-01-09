package com.com_05.test_04;

// 并发修改异常
// 通过集合for循环来遍历
// 用get来获得值（解决方案）

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

//        Iterator<String>it=list.iterator();
//        while(list.iterator().hasNext()){
//            String s=it.next();
//            if (s.equals("world")) {
//                list.add("javaee");
//            }
//        }
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("world")) {
                list.add("javaee");
            }
        }
        System.out.println(list);
    }
}

