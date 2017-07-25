package Homework;

import java.util.Scanner;

public class HW_04_01and02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/* 1 */
		/* 請建立一個字串,經過程式執行後,輸入結果是反過來的	
		 * 例如String s = “Hello World”,執行結果即為dlroW olleH
		 * (提示:String方法,陣列)								*/
		
		String s = "Hello World"; 
		
		/* 1 - 方法一：將字串轉為字元陣列  */
		char[] c = s.toCharArray();
			// 起始值為陣列長度-1（-1 扣除 [0]）；從[10]遞減至[0]
		for(int i = s.length() - 1; i >= 0; i--) { 
			System.out.print(c[i]);
		}
		
		System.out.println();
		
		/* 1 - 方法二：charAt() method */ 
		for(int i = s.length() - 1; i >= 0; i--) { 
			System.out.print(s.charAt(i)); 
		}
		
		System.out.println();
		
		/* 1 - 延伸：輸入字串並反轉字串 StringBuffer()、StringBuilder() 及 append()、reverse() */
		
		System.out.print("輸入字串：");
		String str_sb = sc.nextLine();
		StringBuffer sb = new StringBuffer();	// 字符串變量（Synchronized，線程安全）
		sb.append(str_sb);	// 增加字串
		sb.reverse();		// 反轉字串
		System.out.println("StringBuffer反轉字串：" + sb.toString());
		
		
		System.out.print("輸入字串：");
		String str_sd = sc.nextLine();
		StringBuilder sd = new StringBuilder();	// 字符串變量（非線程安全）
		sd.append(str_sd);	// 增加字串
		sd.reverse();		// 反轉字串
		System.out.println("StringBuilder反轉字串：" + sd.toString());
		
		
		System.out.println("-----------------------------------");
		
		
		/* 2 */
		/* 有個字串陣列如下 (八大行星):
		 * {“mercury”, “venus”, “earth”, “mars”,
		 * “jupiter”, “saturn”, “uranus”, “neptune”}
		 * 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		 * (提示:字元比對,String方法)						*/
		
		String planet[] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
		/* 方法：將陣列內所有字串連接成一個字串 */
		/* 串接字串方法一 */
		String StrCon = "";
		
		for(int i = 0; i < planet.length; i++) {
			StrCon += planet[i];
		}
		
		/* 串接字串方法二：StringBuffer()、StringBuilder() 及 append()、reverse() */
		StringBuffer StrCon_sb = new StringBuffer(); 
		
		for(int i = 0; i < planet.length; i++) {
			StrCon_sb.append(planet[i]);	// 增加字串
			StrCon_sb.toString();			// 回傳
		}
		
		StringBuilder StrCon_sd = new StringBuilder(); 
		
		for(int i = 0; i < planet.length; i++) {
			StrCon_sd.append(planet[i]);	// 增加字串
			StrCon_sd.toString();			// 回傳
		}
		
		/* 方法一 */
		int vowel_count = 0;	// 計次
		
		for(int x = 0; x < StrCon.length(); x++) {
			char letter = StrCon.charAt(x);
			if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
			vowel_count++;
		}
		
		/* 方法二：設定母音字元陣列，並使用兩個for迴圈比較 */
		int vowel_count2 = 0;	// 計次
		char[] vowelArray = {'a', 'e', 'i', 'o', 'u'};
		
		for(int x = 0; x < StrCon.length(); x++) {
			for(int y = 0; y < vowelArray.length; y++) {
				if(StrCon.charAt(x) == vowelArray[y]) {		// 若字串中的字元符合母音字元陣列中的元素，則計次
					vowel_count2++;
				}
			}
		}
		
		System.out.println("方法一：字串 \"" + StrCon + "\" 共有" + vowel_count + "個母音");

		System.out.println("方法二：字串 \"" + StrCon_sb + "\" 共有" + vowel_count2 + "個母音");
		
		sc.close();
	}

}