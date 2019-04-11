package com.ywm.entity;

/**
 * Create by YWM on 2019/4/10.
 * @author YWM
 */
public class Student {
    public int id = 1;
    public String name;
    public float score;

    public void show(){
        this.id = 2;
//        this.show();//递归
        show2();
        System.out.println(id);
    }

    public void show2(){
        System.out.println("show2");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.show();
    }

    public Student() {

    }

    public Student(int id, String name, float score) {
        this();
        this.id = id;
        this.name = name;
        this.score = score;
    }
}
