package com.ywm.array2;

public class Array2 {
    public static void main(String[] args){
        //1声明二维数组
//        int[][] array;
        //2分配内存空间
//        array = new int[3][5];
        //3赋值
//        array[0][0] = 100;
//        array[0][1] = 90;
//        array[1][0] = 80;
//        array[1][1] = 70;
//        array[2][0] = 60;
//        array[2][1] = 50;
        int[][] array = {{100,90,80,70,60},{100,90,80,70,60},{100,99,80,70,60}};
        System.out.print(array[2][1]);
    }
}
