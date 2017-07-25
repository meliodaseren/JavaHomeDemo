package Mod_II;

/* 請建立一個正立方體Cube.java檔案，並定義邊長屬性(double length)，
 * 建構子(Constructor)與getter/setter方法
 * 
 * 產生一個cube物件並同時傳入邊長值，若是值為0或負數，
 * 則拋出自行定義的例外CubeException，顯示「正立方體邊長不得為0或是負數」。
 * 
 * 若是傳入邊長的值沒有問題，則顯示體積。
 * 
 * 配合Cube.java、CubeException.java使用				*/

public class CubeMain {
	
	public static void main(String args[]) {
		try {
			Cube c1 = new Cube(2);
			System.out.println(c1.getVolume());
			
			Cube c2 = new Cube();
			c2.setLength(3);
			System.out.println(c2.getVolume());
			
		} catch(CubeException ce) {
			System.out.println(ce.getMessage());
//			ce.printStackTrace();
		}
	}

}
