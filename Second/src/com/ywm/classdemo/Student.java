package com.ywm.classdemo;

/**
 * Create by YWM on 2019/4/9.
 */
public class Student {
    public int id;
    public String name;
    public int age;
    public String gender;

    public void show(){
        System.out.println("学生信息如下:");
        System.out.println("学号："+id);
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("性别："+gender);

    }

}
