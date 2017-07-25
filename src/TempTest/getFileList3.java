package TempTest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class getFileList3 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("D://Scholar");
		ArrayList<String> fileList = new ArrayList<String>();	// 宣告一的動態陣列來儲存檔名
		
		if(f.isDirectory()) {							// 如果f讀到的是資料夾，就會執行
			System.out.println("Directory Name: " + f.getName());
			String []s = f.list();
			System.out.println("Size: " + s.length);	// 資料夾裡的檔案個數
			
			for(int i = 0; i < s.length; i++)			// System.out.println(s[i]);
				fileList.add(s[i]);						// 將檔名一個一個存到fileList動態陣列
		}
		
		for(int i = 0; i < fileList.size(); i++)
			System.out.println(fileList.get(i));		// 資料夾內的檔名
		
	}
	
}
