package TempTest;

import java.io.File;

public class getFileList2 {

	public static void main(String[] args) {
		File f = new File("D://Scholar");
		File[] f1 = f.listFiles();
		for(int i = 0; i < f.listFiles().length; i++)
			System.out.println(f1[i].getParent() + "\t" + f1[i].getName());
		
		System.out.println("-------------------------------");
		
		String[] f2 = f.list();
		for(int i = 0; i < f2.length; i++)
			System.out.println(f2[i]);
	}
}
