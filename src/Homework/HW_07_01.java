package Homework;

/* 1 */
/* 請寫一個程式，可以在讀入一個檔案後，顯示有多少個位元組 */

import java.io.*;
//import java.text.DecimalFormat;

public class HW_07_01 {
	
	public static void main(String[] args) throws IOException {
		File inputFile = new File("E:\\java_workspace\\JavaHomeDemo\\src\\Homework\\file\\Sample.txt");
		System.out.println("檔案大小： " + inputFile.length() + " 位元組");
		
		FileInputStream fis = new FileInputStream(inputFile);
		System.out.println("檔案大小： " + fis.available() + " 位元組");
		
		fis.close();
	}
	
	/* 例外處理法二，使用try-with-resources確保資源關閉 */
//	public static void main(String[] args) throws IOException {
//		File inputFile = new File("E:\\java_workspace\\JavaHomeDemo\\src\\Homework\\file\\Sample.txt");
//		try (FileInputStream fis = new FileInputStream(inputFile);){
//			float size = (float) fis.available() / 1024;
//			DecimalFormat df = new DecimalFormat("0.00");
//			String filesize = df.format(size);
//			System.out.println("檔案大小：" + filesize + " KB (" + fis.available() + "位元組)");
//		} catch (FileNotFoundException e) {
////			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//	}
}
