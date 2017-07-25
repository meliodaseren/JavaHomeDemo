package Homework;

import java.io.*;

/* 2 */
/* 請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
 * Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
 * (分別使用FileInputStream, FileReader, BufferedReader處理) */

public class HW_07_02 {
	
	public static void main(String[] args) throws IOException {
		File inputFile = new File("E:\\java_workspace\\JavaHomeDemo\\src\\Homework\\file\\Sample.txt");
		
		/* 檔案位元組 */
		FileInputStream fis = new FileInputStream(inputFile);
		System.out.print(inputFile.getName() + "檔案共有" + fis.available() + "位元組，");
		
		
		/* 檔案字元數 */
		FileReader fr = new FileReader(inputFile);
		// 法一
		char[] ch = new char[(int)inputFile.length()];
		System.out.print(fr.read(ch) + "個字元，");
		
		// 法二 
//		int i = 0;
//		while (fr.read() != -1) {
//			i++;
//		}
//		System.out.print(i + "個字元，");
		
		// 法三
//		char ch[] = new char[(int)inputFile.length()];
//		int num = fr.read(ch);
//		String str = new String(ch, 0, num);
//		System.out.print(num + "個字元，");
		
		
		/* 檔案列數（readLine 或 LineNumberReader） */
		BufferedReader bfr = new BufferedReader(new FileReader(inputFile));	// FileReader fr
		int lines = 0;
		while(bfr.readLine() != null) {
			lines++;
		}
		System.out.println(lines + "列資料");
		
		bfr.close();
		fr.close();
		fis.close();
	}
	
}
