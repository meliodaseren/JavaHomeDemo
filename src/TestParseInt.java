/* 字串轉整數 */
/* https://www.inote.tw/java-parse-string-to-int */

/*
public static int parseInt(String s,int radix);
public static int parseInt(String s);
*/

public class TestParseInt {
	public static void main(String[] args) {
		
		String input = "10";
		int afterConvert = Integer.parseInt(input);
		System.out.println(afterConvert);
		
		/* radix為2，也就是雖然我們數字是 10，但Java會將他視為二進位的10，所以afterConvert的答案為 2。 */
		String input2 = "10";
		int afterConvert2 = Integer.parseInt(input2,2);
		System.out.println(afterConvert2);
		
		/* 不過由於使用者輸入的可能會不是「數字字串」，
		 * 所以建議用「throws NumberFormatException」，
		 * 通常會寫成類似下面的使用方式，來防止錯誤來產生 */
		int afterConvert3 = 0;
		try{
		   String input3 = "10";
		   afterConvert3 = Integer.parseInt(input3,2);
		}catch(NumberFormatException e){
		   afterConvert3 = 0;
		}
		System.out.println(afterConvert3);
		
	}
}

