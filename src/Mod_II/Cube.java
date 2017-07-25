package Mod_II;

/* 請建立一個正立方體Cube.java檔案，並定義邊長屬性(double length)，
 * 建構子(Constructor)與getter/setter方法
 * 
 * 產生一個cube物件並同時傳入邊長值，若是值為0或負數，
 * 則拋出自行定義的例外CubeException，顯示「正立方體邊長不得為0或是負數」。
 * 
 * 若是傳入邊長的值沒有問題，則顯示體積。
 * 
 * 配合CubeMain.java、CubeException.java使用			*/

public class Cube {
	
	private double length;
	
	public Cube() {
		super();
	}
	
	public Cube(double length) throws CubeException {
		setLength(length);
	}
	
	public double getLength() {
		return length;
	}
	
	// 設定例外條件 
	public void setLength(double length) throws CubeException {
		if(length > 0) {
			this.length = length;
		} else {
			throw new CubeException("正立方體邊長不得為0或是負數");
		}
	}
	
	public double getVolume() {
		return Math.pow(length, 3);
	}
	
}
