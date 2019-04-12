package com.ywm.demo190412;

/**
 * Create by YWM on 2019/4/12.
 */
public class Students {
    public String name;
    public int score;

    public void show(){
        System.out.println(name+"的成绩是"+score);
    }

    public Students(String name) {
        this.name = name;
    }

    public Students() {
    }
}
