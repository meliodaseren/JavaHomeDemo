package Homework;

public class HW_02 {
	
	public static void main(String[] args) {
		
		/* 1 */
		/* 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000) */
        int sum = 0;
		for (int count = 2; count <= 1000; count+=2) {
        	sum += count;
		}
        System.out.println(sum);

        
		System.out.println("-------------------------------------------");
		
		/* 2 */
		/* 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈) */
		int bigpi = 1;
		for (int num = 1; num <= 10; num++) {
			bigpi *= num;
		}
		System.out.println(bigpi);
		
		
		System.out.println("-------------------------------------------");

		/* 3 */
		/* 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈) */
		int bigpi2 = 1;
		int num2 = 0;
		while (num2 < 10) {
			num2++;				// 1			// 
			bigpi2 *= num2;		// 1 * 1 = 1	// 
		}
		System.out.println(bigpi2);	

		/* do…while_01 */
		int bigpi3 = 1;
		int num3 = 1;
		do {
			num3++;
			bigpi3 *= num3;
		} while (num3 < 10);
		System.out.println(bigpi3);

		/* do…while_02 */
		int bigpi4 = 1;
		int num4 = 1;
		do {
			bigpi4 *= num4;
			num4++;
		} while (num4 <= 10);
		System.out.println(bigpi4);

		System.out.println("-------------------------------------------");


		/* 4 */
		/* 請設計一隻Java程式，輸出結果為以下：	*
		 * 1 4 9 16 25 36 49 64 81 100 			*/
		for (int squ = 1; squ <= 10; squ++) {
			System.out.print((int)Math.pow(squ, 2) + " ");
		}
		
		
		System.out.println("\n" + "-------------------------------------------");
		
		/* 5(進階) */
		/* 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。	*
		 * 請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？			*/
		
				// 需要排除的個位數：  4, 14, 24, 34, 44
				// 需要排除的十位數：40, 41, 42, 43, 44(re*), 45, 46, 47, 48, 49
		
		int sum_ball = 0;
		System.out.print("可以選擇的數字有 ");
		for (int ball = 1; ball <= 49; ball++) {
			if (ball % 10 == 4) {		// 排除個位數為 4 的數字
				continue;
			}
			else if (ball / 10 == 4) {	// 排除十位數為 4 的數字
				continue;
			}
			else {
				System.out.print(ball + " ");
			}
			sum_ball++;
		}
		System.out.println("\n" + "總共 " + sum_ball + " 個數字");
		
		System.out.println("-------------------------------------------");
		
		/* 6(進階) */
		/* 請設計一隻Java程式，輸出結果為以下：	*
		 * 1 2 3 4 5 6 7 8 9 10					*
		 * 1 2 3 4 5 6 7 8 9					*
		 * 1 2 3 4 5 6 7 8						*
		 * 1 2 3 4 5 6 7						*
		 * 1 2 3 4 5 6							*
		 * 1 2 3 4 5							*
		 * 1 2 3 4								*
		 * 1 2 3								*
		 * 1 2									*
		 * 1									*/
		
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
//		for (int i = 1; i <= 10; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		System.out.println("-------------------------------------------");
		
		/* 7(進階) */
		/* 請設計一隻Java程式，輸出結果為以下：	*
		 *	A									*
		 *	BB									*
		 *	CCC									*
		 *	DDDD								*
		 *	EEEEE								*
		 *	FFFFFF 								*/
		
		int abc = 65;							// 字元 A 的 ASCII 十進位值
		for (int i2 = 1; i2 <= 6; i2++) {
			for (int j2 = 1; j2 <= i2; j2++) {
				System.out.print((char)abc);	// 輸出字元(char)
			}
			System.out.println();
			abc++;								// 排完第一列後，遞增字元的 ASCII 十進位值
		}
		
//		int abc2 = 70;
//		for (int i2 = 6; i2 >= 1; i2--) {
//			for (int j2 = 1; j2 <= i2; j2++) {
//				System.out.print((char)abc2);
//			}
//			System.out.println();
//			abc2--;
//		}
		
	}

}
