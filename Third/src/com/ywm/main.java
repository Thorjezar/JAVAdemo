package com.ywm;

import java.util.Scanner;

/**
 * Create by YWM on 2019/4/12.
 */
public class main {
    public static void main(String[] args) {


/*        penguin penguin = new penguin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.print("请输入企鹅年龄");
        int age = scanner.nextInt();
        penguin.setAge(age);
        System.out.println(penguin);*/


        //多个选民投票
        while (true){
            Persons persons = new Persons();
            persons.vote();
            if(persons.getVotes()>100){
                break;
            }
            System.out.println("当前的票数是"+persons.getVotes());
        }
        System.out.println("投票结束！");
    }
}
