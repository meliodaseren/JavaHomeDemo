package TempTest;

public class getFileList1 {
	
	 /* 輸入資料夾的路徑, 顯示得該資料夾下的所有檔案
	  * @param String folderPath
	  * @author Lupin					*/
	
	public static void getFileList(String folderPath) {
	    //String folderPath = "C:\\";//資料夾路徑
		StringBuffer fileList = new StringBuffer();
		try{
			java.io.File folder = new java.io.File(folderPath);
			String[] list = folder.list();    
				for(int i = 0; i < list.length; i++) {
					fileList.append(list[i]).append(", ");
				}
		} catch(Exception e) {
			System.out.println("'"+folderPath+"'此資料夾不存在");
		} 
		System.out.println(fileList);
	}
	
	public static void main(String args[]) {
		getFileList("D://Scholar");
	}

}
