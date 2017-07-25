package TempTest;

import java.io.File;

public class getFileList5 {
	
	public static void printFnames(String folderPath) {
		File[] fa = new File(folderPath).listFiles();
//		String[] endsWithType = {".pdf", ".ppt"};
		for(File file : fa) {
			if(file.getName().endsWith(".pdf")) {
//			if(file.getName().matches("^(.*?)")) {
				System.out.println(file.getAbsolutePath());
			}
			if(file.isDirectory()) {
				printFnames(file.getAbsolutePath());
			}
		}
	}
	
	public static void main(String args[]) {
		printFnames("D://Scholar");
	}
}
