package Homework;

/* 3 */
/* 請寫一隻程式，能夠亂數產生10個1～1000的整數，
 * 並寫入一個名為Data.txt的檔案裡
 * (請參考本章講義第23頁，使用append方式觀察效果) */

public class HW_07_03 {

	public static void main(String[] args) {
		
		int[] ra = new int[10];
		for(int i = 0; i < 10; i++) {
			ra[i] = (int) (Math.random() * 1000 + 1);
			System.out.println(ra[i]);
		}
		
	}

}