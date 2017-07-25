package Mod_I;
/* 0~100之間猜數字，系統會提示大或小，直到猜中數字。 */

import java.util.Scanner;

public class Guessing_Game {
    public static void main(String[] args) {
        int max = 100, min = 0, i;
        int j = (int)(Math.random() * 100 + 1);
        //int mid;
        
        System.out.println("答案：***");

        while (true) {
            System.out.print("請猜一個 1 到 100 的數字：");
            //catch number
            Scanner rsScanner = new Scanner(System.in);
            i = rsScanner.nextInt();
            System.out.println("你輸入的數字：" + i);
            
            //mid = (min + max)%2;
            
            if (i == j) {
                System.out.println("你猜對了！");
                break;
            } else if (i < j) {
                System.out.println("比這個數字大");
                System.out.println(i + " ~ " + max);
                System.out.println("----------------------");
                min = i;
                //mid = (max + min) % 2;
            } else if (i > j) {
                System.out.println("比這個數字小");
                System.out.println( min + " ~ " + i);
                System.out.println("----------------------");
                max = i;
                //mid = (min + max) %2;
            }
            
            rsScanner.close();
        }
	}

}