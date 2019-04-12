package com.ywm.demo190412;


import javax.swing.*;
import java.util.Scanner;

/**
 * Create by YWM on 2019/4/12.
 */
public class Main {
    public static void main(String[] args) {
        Students student1 = new Students("张三");
        Students student2 = new Students("李四");
        Students student3 = new Students("王五");
        ScoreTools scoreTools = new ScoreTools();

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入"+student1.name+"的成绩是");
        student1.score = scanner.nextInt();
        System.out.print("请输入"+student2.name+"的成绩是");
        student2.score = scanner.nextInt();
        System.out.print("请输入"+student3.name+"的成绩是");
        student3.score = scanner.nextInt();
        Students[] Array = {student1,student2,student3};
        System.out.println("*********修改之前的学生成绩**************");
        for (Students stu:Array
             ) {
            stu.show();
        }

        scoreTools.update(Array);
        System.out.println("*********修改后的学生成绩**************");
        for (Students stu:Array
        ) {
            stu.show();
        }

    }
}
