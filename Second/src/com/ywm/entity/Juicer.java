package com.ywm.entity;

/**
 * Create by YWM on 2019/4/11.
 */
public class Juicer {
    public void getJuicer(String juicer){
        System.out.println(juicer+"汁");
    }

    public static void main(String[] args) {
        Juicer juicer = new Juicer();
        juicer.getJuicer("苹果");
    }

}
