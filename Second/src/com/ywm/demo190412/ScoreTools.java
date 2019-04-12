package com.ywm.demo190412;

/**
 * Create by YWM on 2019/4/12.
 */
public class ScoreTools {

    public void update(Students[] Array){
        for (Students stu:Array
             ) {
            if(stu.score < 60){
                for(Students stu2:Array){
                    stu2.score += 2;
                }
            }

        }
    }

    public void getResult(int[] array){
        int sum = 0;
        int max = array[0];
        for(int score:array){
            sum += score;
            if(score > max){
                max = score;
            }
        }

        float avg = sum/array.length;

        System.out.println("平均成绩是"+avg+"最高成绩"+max+"总分"+sum);
    }
}
