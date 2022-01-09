package com.com_04.test_05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<String>();

        //添加元素用add方法
        c.add("hello");//永远返回true
        c.add("world");
        c.add("java");

        //移除
        c.remove("java");
        c.remove("123");//返回false

        //clear()方法
        c.clear();

        c.add("world");
        c.add("java");
        c.add("he");

        //是否存在每个指定元素
        System.out.println(c.contains("java"));

        //判断是否为空
        //c.clear();
        System.out.println(c.isEmpty());

        //判断长度
        System.out.println(c.size());
        Iterator<String> it = c.iterator();
        //Collection的遍历
        /*

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        */
//        if (it.hasNext()) {
//            System.out.println(it.next());
//        }
//
//        if (it.hasNext()) {
//            System.out.println(it.next());
//        }
//
//        if (it.hasNext()) {
//            System.out.println(it.next());
//        }

        //用while循环改进判断while
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        //输出集合对象
        //System.out.println(c);
    }
}
