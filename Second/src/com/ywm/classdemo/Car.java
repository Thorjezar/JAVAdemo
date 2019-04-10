package com.ywm.classdemo;

/**
 * Create by YWM on 2019/4/9.
 */
public class Car {
    //定义属性

    public String color;
    public int age;
    public String brand;
    public float width;
    public float height;

    //定义方法
    public void start(String localtion){
        System.out.println("将车开到"+localtion);
    }

    public float getSpeed(float km,float hour){
        float speed = km/hour;
        return speed;
    }

    //构造函数
    public Car(){

    }
    public Car(String color,int age,String brand,float width,float height){
        this.width = width;
        this.height = height;
        this.color = color;
        this.age = age;
        this.brand = brand;
    }
}
