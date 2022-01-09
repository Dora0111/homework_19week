package com.com_05.test_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("大帅哥", 35);
        Student s3 = new Student("傅作涛", 20);

        //学生添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历迭代器
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------");

        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------");

        //增强for循环
        for (Student s : list) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
