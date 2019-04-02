package com.ywm.second;

public class Second {
    public static void main(String[] args){
        for (int i=0;i<5;i++){
            //输出空格
            for (int j=0;j<4-i;j++){
                System.out.print(" ");
            }
            // 输出星号
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            //输出空格
            for (int j=0;j<4-i;j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        for(int i = 0;i < 4;i++){
            //输出空格
            for(int j = 0;j<i+1;j++){
                System.out.print(" ");
            }
            //输出星号
            for(int k = 0;k < 7-2*i; k++){
                System.out.print("*");
            }
            //输出空格
            for(int j = 0;j<i+1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
