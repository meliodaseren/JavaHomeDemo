package Homework;

/* 請設計兩個類別CalException.java與CalTest.java，
 * 在CalTest.java裡有個自訂方法為powerXY(int x, int y)，
 * 功能是會計算x的y次方並回傳結果。
 * 使用者可以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
 * 1. x與y同時為0，(產生CalException的例外物件)
 * 2. y為負值，而導致x的y次方結果不為整數
 * 3. x與y皆正確情況下，會顯示運算後結果							*/

import java.util.Scanner;

public class CalTest {
	
	public CalTest() {
		super();
	}
	
	// 設定方法一
	public int powerXY(int x, int y) throws CalException {
		if(x == 0 && y ==0) {
			throw new CalException("0的0次方沒有意義！");
		} else if(y < 0) {
			throw new CalException("次方為負值，回傳結果不為整數！");
		} else
			return (int) Math.pow(x, y);
	}
	
	// 設定方法二
//	public int powerXY(int x, int y) {
//		if(x == 0 && y ==0) {
//			try {
//				throw new CalException("0的0次方沒有意義！");
//			} catch (CalException e) {
//				System.out.println(e.getMessage());
//				// 或
////				e.printStackTrace();
//			}
//		}
//		if(y < 0) {
//			try {
//				throw new CalException("次方為負值，回傳結果不為整數！");
//			} catch (CalException e) {
////				System.out.println(e.getMessage());
//				// 或
//				e.printStackTrace();
//			}
//		}
//		return (int) Math.pow(x, y);
//	}
	
	public static void main(String[] args) throws CalException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入x的值：");
		int sc_x = sc.nextInt();
		System.out.println("請輸入y的值：");
		int sc_y = sc.nextInt();
		
		CalTest squarexy = new CalTest();
		System.out.println(squarexy.powerXY(sc_x, sc_y));
		
		sc.close();
	}

}
