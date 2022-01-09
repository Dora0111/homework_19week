package com.com_02.test_07;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.setName("林青霞");
        s1.setAge(30);

        Student s2= new Student();
        s2.setName("林青霞");
        s2.setAge(30);
        System.out.println(s1.equals(s2));
    }
}
