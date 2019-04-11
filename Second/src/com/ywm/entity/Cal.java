package com.ywm.entity;

import java.util.Arrays;

/**
 * Create by YWM on 2019/4/11.
 */
public class Cal {

//    public int add(int num1,int num2){
//        return num1 + num2;
//    }
//
//    //函数重载
//    public int add(int num1,int num2,int num3){
//        return num1 + num2 + num3;
//    }
//
//    public void add(int num,String name){
//
//    }

    //动态参数
    public int add(int... num){
        System.out.println(Arrays.toString(num));
        int sum = 0;
        for (int i:num
             ) {
            sum += i;
        }
        return sum;
    }
    /*public int add2(int num1,int num2,int num3){
        return num1 + num2 + num3;
    }*/
}
