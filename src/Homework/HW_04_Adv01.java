package Homework;

import java.util.Scanner;

public class HW_04_Adv01 {
	
	public static void main(String[] args) {
		
		/* 進階題1 */
		/* 請設計一隻程式由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，
		 * 它會顯示是該年的第幾天
		 * 例：輸入1984 9 8 三個號碼後，程式會顯示「西元1984年，第250天」
		 * (提示1：Scanner，陣列)
		 * (提示2：需將閏年條件加入)
		 * (提示3：輸入月份如為2月，則日期不該超過29天) */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請照格式輸入日期（yyyy mm dd）：");
		int sc_y = sc.nextInt();	// 輸入年份
		int sc_m = sc.nextInt();	// 輸入月份
		int sc_d = sc.nextInt();	// 輸入天數
		
		int sc_m_re = sc_m - 1;		// 修正月份以便陣列索引
		
		int[] month_array = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// 將各月份的天數設為陣列
		
		// 判斷閏年，格里曆閏年規則：(是4的倍數但不是100的倍數)或(400的倍數)
		if (((sc_y % 4 == 0) && (sc_y % 100 != 0)) || (sc_y % 400 == 0)) {
			month_array[1] = 29;	// 符合規則就將2月修改為29日
		}
		
		// 判斷輸入的合理性；最後一個條件表示輸入月份對照的天數符合輸入的天數
		if(sc_y > 0 && sc_m >= 1 && sc_m <= 12 && sc_d >= 1 && month_array[sc_m_re] >= sc_d) {
			for(int i = 0; i < sc_m_re; i++) {
				sc_d += month_array[i];			// 疊加輸入月份之前的所有月份 + 輸入天數
			}	
			System.out.print("西元" + sc_y + "年，第" + sc_d + "天");
		} else {
			System.out.println("輸入格式錯誤，請重新輸入。");
		}
		
		sc.close();
		
	}

}
