package com.ywm.classdemo;

/**
 * Create by YWM on 2019/4/11.
 */
public class StudentTool {

    public String[] array = new String[5];

    public boolean findName(int start,int end,String name){
        for(int i = start; i <= end; i++){
            String val = array[i];
            if(name.equals(val)){
                return true;
            }
        }
        return false;
    }
}
