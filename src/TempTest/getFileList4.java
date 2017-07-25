package TempTest;

import java.io.*;

public class getFileList4 {
	public static void main(String[] args) {
		
		File a = new File("D://Scholar");
		String[] filenames;
		String fullpath = a.getAbsolutePath();
		
		if(a.isDirectory()) {
			filenames=a.list();
			for (int i = 0 ; i < filenames.length ; i++) {         
				File tempFile = new File(fullpath + "\\" + filenames[i]);
				if(tempFile.isDirectory()) {
					System.out.println("目錄: " + filenames[i]);
				} else
					System.out.println("檔案: " + filenames[i]);
			}
		} else
			System.out.println("[" + a + "]不是目錄");
	}
}
