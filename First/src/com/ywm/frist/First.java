package com.ywm.frist;

import java.util.Scanner;

public class First {
    public static void main(String[] args){
//        final float PI = 3.14f;
//        PI =3.2f;
//        int num1 = 1;
//        int num2 = 2;
//        int result = num1+num2;
//        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
//        int cardId = scanner.nextInt();
//        System.out.println(cardId);
        String result = "你猜";
        String str = scanner.next();
        if (result.equals(str)){
            System.out.println("我不猜");
        }else{
            while(!str.equals("你猜")){
                System.out.println("再输入");
            }
            System.out.println("哈哈 ");
        }
    }
}
