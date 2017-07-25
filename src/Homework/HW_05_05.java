package Homework;

/* 5 */
/* 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，
 * 請設計一個方法void genAuthCode()，當呼叫此方法時，
 * 會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫與數字的亂數組合	*/

public class HW_05_05 {
	
	/* 使用字串串接和ASCII，此方法之亂數非完全平均生成 */
	private void genAuthCode() {
		int x;
		StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < 8; i++) {
	    	
	    	// Modulo operator: 當隨機函數的值域很大，但我們要的範圍很小的時候，就可以使用Modulo operator來取得亂數。
	    	x = (int) ((Math.random() * 7) % 3);

	    	if (x == 1) {
//	    		sb.append((int) ((Math.random() * 10) + 1));
	    		sb.append((char) ((Math.random() * 10) + 48));
	    		// [0, 1) -> [0, 10) -> [48, 58) -> (int) [48, 57] -> (ASCII)數字 0 ~ 9
	    	} else if (x == 2) {
	    		sb.append((char) (((Math.random() * 26) + 65)));
	    		// [0, 1) -> [0, 26) -> [65, 91) -> (int) [65, 90] -> (ASCII)大寫英文 A ~ Z
	    	} else {
	    		sb.append(((char) ((Math.random() * 26) + 97)));
	    		// [0, 1) -> [0, 26) -> [97, 123) -> (int) [97, 122] -> (ASCII)小寫英文 a ~ z
	    	}
	    }
	    System.out.println(sb.toString());
	}
	
	/* 直接將可能字元組成陣列 */
	private void genAuthCode2() {
		char[] codeArray = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
							 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
							 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
							 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
							 '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'				  };
		for(int i = 0; i < 8; i++) {
			int x = (int) ((Math.random() * codeArray.length));
			System.out.print(codeArray[x]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		HW_05_05 captcha = new HW_05_05();
		System.out.print("隨機驗證碼：");
		captcha.genAuthCode();
		
		System.out.print("隨機驗證碼：");
		captcha.genAuthCode2();
	}
	
}
