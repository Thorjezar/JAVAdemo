package com.ywm.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] array = {37,160,16,83,66};
        //array 升序排列
        //数组中的数据依次两两对比，大的数字放在后面
        //第一次排序
//        for (int i = 0;i < 4;i++){
//            if(array[i] > array[i+1]){
//                int temp = array[i];
//                array[i] = array[i+1];
//                array[i+1] = temp;
//            }
//        }
//        //第二次排序
//        for (int i = 0;i < 3;i++){
//            if(array[i] > array[i+1]){
//                int temp = array[i];
//                array[i] = array[i+1];
//                array[i+1] = temp;
//            }
//        }
//        for (int i = 0;i < 2;i++){
//            if(array[i] > array[i+1]){
//                int temp = array[i];
//                array[i] = array[i+1];
//                array[i+1] = temp;
//            }
//        }
//        for (int i = 0;i < 1;i++){
//            if(array[i] > array[i+1]){
//                int temp = array[i];
//                array[i] = array[i+1];
//                array[i+1] = temp;
//            }
//        }

        for (int i = 0; i < array.length-1 ;i++){
            for (int j = 0;j<array.length-1-i;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        // Arrays.sort(array);
        for (int k:array) {
            System.out.print(k+"\t");
        }
    }
}
