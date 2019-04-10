package com.ywm.demo;

/**
 * Create by YWM on 2019/4/9.
 */
public class Arrays {
    public static int binarySearch(String[] array,String name){
        int index = -1;
        for(int i = 0;i < array.length;i++){
            if(name.equals(array[i])){
                index = i;
                break;
            }
        }
        return index;
    }
}
