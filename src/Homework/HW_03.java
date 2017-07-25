package Homework;

import java.util.Scanner;

public class HW_03 {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
	/* 1 */
	/* 請設計一隻程式，使用者輸入三個數字後，輸出結果會為	*
	 * 正三角形、等腰三角形、其它三角形或不是三角形：		*/
	/* 進階挑戰：加入直角三角形的判斷 */
		
		/* 構成三角形的條件：a + b <= c || a * b * c = 0
		 * 判斷順位1：正三角形（同是等腰三角形）：a = b && b = c
		 * 判斷順位2：等腰直角三角形（但三邊皆不可能為整數）
		 * 判斷順位3：直角三角形：(a * a) = (b * b) + (c * c) ||
		 *						 (b * b) = (a * a) + (b * b) ||
		 *						 (c * c) = (a * a) + (b * b)
		 * 判斷順位4：等腰三角形：a + b > c && a = b
		/* 其他三角形：銳角或鈍角三角形									*/
	
		System.out.println("請輸入三個整數：");
		int a = enter.nextInt();
		int b = enter.nextInt();
		int c = enter.nextInt();
	
		if(a + b <= c || a + c <= b || b + c <= a || a * b * c == 0) {
			System.out.println("無法構成三角形");
		} else if(a == b && b == c) {
			System.out.println("正三角形");
		} else if(( a == b || b == c || a == c ) && (a * a + b * b == c * c || c * c + b * b == a * a || a * a + c * c == b * b)) {
			System.out.println("等腰直角三角形");
		} else if(a == b || b == c || a == c) {
			System.out.println("等腰三角形");
		} else if((a * a + b * b == c * c || c * c + b * b == a * a || a * a + c * c == b * b)) {
			System.out.println("直角三角形");
		} else {
			System.out.println("其他三角形");
		}
		
		System.out.println("----------------------------");
	
	/* 2 */
	/* 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，	*
	 * 猜錯會顯示錯誤訊息，猜對則顯示正確訊息：						*/
		int number;
		int random = (int)(Math.random() * 10);		// 0 <= random < 10
		
		while(true) {
			System.out.println("開始猜數字吧！");
			number = enter.nextInt();
		
			if(number == random) {
				System.out.println("答對了！答案就是" + number);
				break;
			} else {
				System.out.println("猜錯囉" + "\n");
			}
		}
		
//		do {
//			System.out.println("開始猜數字吧！");
//			number = enter.nextInt();
//		
//			if(number == random) {
//				System.out.println("答對了！答案就是" + number);
//			} else {
//				System.out.println("猜錯囉");
//			}
//		} while(number != random);

		System.out.println("----------------------------");
		
	/* 進階挑戰：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案) */
		
		int number2;
		int random2 = (int)(Math.random() * 100);
		int max = 100, min = 0;
		
		while(true) {
			System.out.println("開始猜數字吧！");
			number2 = enter.nextInt();
		
			if(number2 == random2) {
				System.out.println("答對了！答案就是" + number2);
				break;
			} else if(number2 < random2) {
				System.out.println("比這個數字大");
				System.out.println(number2 + " ~ " + max);
				System.out.println("繼續猜");
			} else if(number2 > random2) {
				System.out.println("比這個數字小");
				System.out.println(min + " ~ " + number2);
				System.out.println("繼續猜");
			}
		}
		
		System.out.println("----------------------------");
		
	/* 3 */
	/* 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，	*
	 * 但這次他想要依心情決定討厭哪個數字，請您設計一隻程式，讓阿文		*
	 * 可以輸入他不想要的數字，畫面會顯示他可以選擇的號碼與總數			*/
        
        System.out.println("請輸入你討厭哪一個數字？");
        int number3 = enter.nextInt();	// 輸入不想要的數字（僅一個數字）
        int lf = 0;						// 換行用
        
        for(int i = 1; i < 50; i++) {           
        	if(i == number3) {
        		continue;
        	}
        	
        	// 每10個號碼換行
        	lf++;
        	if(lf % 10 == 0) {
        		System.out.println(i + "\t");
        	} else {
        		System.out.print(i + "\t");
        	}
        }
        
        System.out.println("\n" + "----------------------------");
        
	/* 進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重覆 */
        
        System.out.println("請輸入你討厭哪一個數字？");
        int number4 = enter.nextInt();	// 輸入不想要的數字（僅一個數字）
        
        int lottery[] = new int[6];
        for(int i = 0; i < 6; i++) {
        	
        	// 生成亂數至陣列內
        	lottery[i] = (int)(Math.random() * 50 + 1);	// 1 <= random < 50
        	
        	// 檢查重覆號碼，若重覆則重抓亂數
        	for(int j = 0; j < i; j++) {
        		if(lottery[i] == lottery[j] || lottery[i] == number4) {
        			lottery[i] = (int)(Math.random() * 50 + 1);	// i--
        			break;
        		}
        	}
        }
        
    	System.out.print("隨機樂透號碼：");
        for(int x = 0; x < lottery.length; x++) {	// 0, 1, 2, 3, 4, 5
        	System.out.print(lottery[x] + " ");		// [0], [1], [2], [3], [4], [5]
        }
        
        enter.close();
	}

}
