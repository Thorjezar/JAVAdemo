package com.ywm.demo190412;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create by YWM on 2019/4/12.
 */
public class Test {
    public static void main(String[] args) {
        int[] score = new int[5];
        ScoreTools scoreTools = new ScoreTools();
        System.out.println("请输入5名参赛者的成绩:");
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < score.length; i++){
            score[i] = scanner.nextInt();
        }
//        System.out.println(Arrays.toString(score));
        scoreTools.getResult(score);

    }
}
