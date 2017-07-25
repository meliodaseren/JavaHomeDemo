package Homework;

public class HW_01 {

	public static void main(String[] args) {
		
		/* 1 */
		/* 請設計一隻Java程式，計算12，6這兩個數值的和與積 */
		int num1 = 12, num2 = 6;
		System.out.println("12與6的和為" + (num1 + num2));
		System.out.println("12與6的積為" + num1 * num2);
		
		
		System.out.println("-------------------------------------------");

		/* 2 */
		/* 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆) */
		int eggs = 200;
		System.out.println("200顆蛋共" + eggs / 12 + "打" + eggs % 12 + "顆");
		
		
		System.out.println("-------------------------------------------");
		
		/* 3 */
		/* 請由程式算出256559秒為多少天、多少小時、多少分與多少秒 */
		int thetime = 256559;
		int thetime_sec = thetime % 60;
		int thetime_min = thetime / 60 % 60;		// int小數點無條件捨去
		int thetime_hr  = thetime / 60 / 60 % 24;
		int thetime_day = thetime / 60 / 60 / 24;
		System.out.println("256559秒為" + thetime_day + "天" + thetime_hr + "時" + thetime_min + "分" + thetime_sec + "秒");
		
		
		System.out.println("-------------------------------------------");
		
		/* 4 */
		/* 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長 */
		final double pi = 3.1415;
		int radius = 5;
		System.out.println("半徑為5的圓面積為" + Math.pow(radius, 2) * pi);
		System.out.println("半徑為5的圓周長為" + radius * 2 * pi);
		
		
		System.out.println("-------------------------------------------");
		
		/* 5 */
		/* 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，	*
		 * 請用程式計算10年後，本金加利息共有多少錢						*/
		
		int present_value = 1500000;	// 本金
		double interest = 0.02;			// 利率
		int year = 10;					// 存入多少年
		System.out.println(Math.round(present_value * Math.pow((1 + interest), year)) + "元");
		// 使用複利公式，結果以Math.round()四捨五入


		System.out.println("-------------------------------------------");
		
		/* 6 */
		/* 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：	*
		 *		5 + 5 													*
		 *		5 + '5' 												*
		 *		5 + "5"													*/
		
		System.out.println(5 + 5);
		// 兩整數數值相加 5 + 5 = 10，因此得10。
		
		System.out.println(5 + '5');
		// 在數值5後面加上字元'5'，字元在和數值相加時會轉換為數值，
		// 其符號和數字的對應關係為ASCII碼，故字元'5'透過轉換後為得到數字53，
		// 5 + 53 = 58，因此得58。
		
		System.out.println(5 + "5");
		// 在數值5後面加上字串"5"，字串為一段文字，因此得55。
	}

}