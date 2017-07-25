package Homework;

/* 請設計兩個類別CalException.java與CalTest.java，
 * 在CalTest.java裡有個自訂方法為powerXY(int x, int y)，
 * 功能是會計算x的y次方並回傳結果。
 * 使用者可以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
 * 1. x與y同時為0，(產生CalException的例外物件)
 * 2. y為負值，而導致x的y次方結果不為整數
 * 3. x與y皆正確情況下，會顯示運算後結果							*/

public class CalException extends Exception {
	
	private static final long serialVersionUID = 4609169282474904165L;

	public CalException() {
		super();
	}
	
	public CalException(String msg) {
		super(msg);
	}	
	
}
