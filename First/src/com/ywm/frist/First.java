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
        System.out.print("请输入值:");
        String str = scanner.next();
        while(!result.equals(str)){
            if(result.equals(str)){
                scanner.close();
                System.out.println("我就不猜");
            }else{
                System.out.print("输入的是"+str);
                System.out.print("再次输入:");
                str = scanner.next();
            }
        }
        scanner.close();
        System.out.print("我就不猜");

    }
}
