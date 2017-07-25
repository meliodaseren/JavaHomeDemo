package Mod_I;

public class HelloEclipse {
	public static void main(String[] args) {
		System.out.println("Hello, Eclipse!");

		int number1 = 10;
		int number2 = 0xC;
		int number3 = 014;
		final double PI = 3.141596;
		System.out.println(PI);
		System.out.println(number1);
		System.out.println(Integer.toBinaryString(number2));
		/* 輸出2進位；https://www.openhome.cc/Gossip/JavaGossip-V1/OutputFormat.htm */
		System.out.printf("%b \n", number3);
		/* 輸出boolean值 */
		
		String s1 = "現在時間";
		int t1 = 16;
		String s2 = "點";
		System.out.println(s1 + t1 + s2);
	}
}
