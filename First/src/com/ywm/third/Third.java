package com.ywm.third;

public class Third {
    public static void main(String[] args){
        for(int i = 1;i <= 9;i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
        int[] array;
        int arras[];
        array = new int[5];
        arras =new int[6];

        // 简单方法
        int[] arraw = {1,2,3,4,5};
        int arrww[] = {1,2,3,4,5};

        int[] asa = new int[] {1,2,3,4,5};

        int ass[] = new int[]{};
        //增强性for循环，foreach循环
        for (int num:arraw){
            System.out.print(num);
        }
    }
}
