package Homework;

/* 1 */
/* 請設計一個方法為starSquare(int width, int height)，
 * 當使用者鍵盤輸入寬與高時，即會印出對應的*長方形			*/

import java.util.Scanner;

public class HW_05_01_starSquare {
	
	public void starSquare(int w, int h) {
		for(int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入寬：");
		int width = sc.nextInt();
		System.out.println("請輸入高：");
		int height = sc.nextInt();
		
		// 建立物件並呼叫方法
		HW_05_01_starSquare square = new HW_05_01_starSquare();
		square.starSquare(width, height);
		
		sc.close();
	}
}
