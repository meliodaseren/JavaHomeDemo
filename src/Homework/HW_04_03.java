package Homework;

import java.util.Scanner;

public class HW_04_03 {

	public static void main(String[] args) {
		
		/* 3 */
		/* 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,
		 * 其員工編號與身上現金列表如下：
		 * 
		 * ————————————————————————————————————————————
		 * | 員工編號 |  25  |  32 |  8  |  19  |  27  |
		 * | 身上現金 | 2500 | 800 | 500 | 1000 | 1200 |
		 * ————————————————————————————————————————————
		 * 
		 * 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
		 * 有錢可借他；並且統計有錢可借的總人數：
		 * 例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
		 * (提示:Scanner,二維陣列)								*/
		
		Scanner sc = new Scanner(System.in);
		
		int[] employee_array = {25,32,8,19,27};			// 員工編號陣列
		int[] money_array = {2500,800,500,1000,1200};	// 身上現金陣列
		
		System.out.print("你要借多少錢？");
		int money = sc.nextInt();
		
		System.out.print("有錢可借的員工編號: ");
		
		int count = 0;	// 計次
		
		for(int i = 0; i < money_array.length; i++) {
			if(money <= money_array[i]) {					// 比對金額
				System.out.print(employee_array[i] + " ");	// 輸出符合的員工編號
				count++;									// 符合就計次
			}
		}
		System.out.print("共 " + count + " 人!");
		
		sc.close();
	}

}
