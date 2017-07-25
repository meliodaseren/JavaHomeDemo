package Mod_II;

/* 請建立一個正立方體Cube.java檔案，並定義邊長屬性(double length)，
 * 建構子(Constructor)與getter/setter方法
 * 
 * 產生一個cube物件並同時傳入邊長值，若是值為0或負數，
 * 則拋出自行定義的例外CubeException，顯示「正立方體邊長不得為0或是負數」。
 * 
 * 若是傳入邊長的值沒有問題，則顯示體積。
 * 
 * 配合Cube.java、CubeMain.java使用					*/

public class CubeException extends Exception {
	
	public CubeException() {
		
	}

	public CubeException(String msg) {
		super(msg);
	}
	
}
