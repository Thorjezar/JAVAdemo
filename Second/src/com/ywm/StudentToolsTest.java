package com.ywm;

import com.ywm.classdemo.StudentTool;

import java.util.Scanner;

/**
 * Create by YWM on 2019/4/11.
 */
public class StudentToolsTest {
    public static void main(String[] args) {

        StudentTool studentTool = new StudentTool();
        Scanner scanner = new Scanner(System.in);
        for(int i = 1;i <= 5;i++){
            System.out.print("请输入学生姓名:");
            studentTool.array[i-1] = scanner.next();

        }
        System.out.print("本班学生列表:");
        for (String names:
                studentTool.array) {
            System.out.print(names+"\t\t");
        }

        System.out.println("");

        System.out.print("请输入开始查找的位置:");
        int start = scanner.nextInt();
        System.out.print("请输入结束查找的位置:");
        int end = scanner.nextInt();

        System.out.print("请输入查找的姓名:");
        String name = scanner.next();

        boolean flag = studentTool.findName(start,end,name);

        System.out.println("*********************************");
        if(flag){
            System.out.println("已经找到啦！");
        }else{
            System.out.println("未找到！");
        }

    }
}
