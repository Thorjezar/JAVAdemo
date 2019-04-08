package com.ywm.array2;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args){
        // 3个班级，每个班级5个学生
        int[][] score = new int[3][5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 1;i <= score.length; i++){
            for (int j = 1; j <= score[0].length; j++){
                System.out.print("请输入第"+i+"班的第"+j+"个学员的成绩");
                score[i-1][j-1] = scanner.nextInt();
            }
        }
//        System.out.println(Arrays.toString(score));
//        for (int k = 0; k < score.length; k++){
//            for (int z = 0; z < score[0].length; z++){
//                System.out.println(score[k][z]);
//            }
//        }
        for (int z = 0;z < score.length; z++){
//            System.out.print(Arrays.toString(score[z]));
            int sum = 0;
            for (int scores:
                 score[z]) {
                sum += scores;
            }
            System.out.println(sum);
        }
    }
}
