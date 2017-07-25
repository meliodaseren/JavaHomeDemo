package Mod_I_Array;
/*
 *	請分別建立x, y, z三個3x3的int陣列，然後再將x和y陣列的加總存放
 *	到z陣列裡，再將結果顯示於螢幕上
 *
 *	x和y陣列中的數字：
 *	請用亂數產生介於0～30之間的整數
 *	亂數之取得可參考 java.lang.Math的靜態方法 random()
 *	public static double random()：範圍為0.0～1.0
 *
 *	與TestRandomArray.java、TestRandomArray2.java共用
 */

public class TestRandomArray1 {

	public static void main(String[] args) {
		// 1. x array
		int[][] x = new int[3][3];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				int random = (int)(Math.random() * 31);
				x[i][j] = random;
			}
		}
		
		// 2. y array
		int[][] y = new int[3][3];
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				int random = (int)(Math.random() * 31);
				y[i][j] = random;
			}
		}
		
		// 3. x + y -> z array
		int[][] z = new int[3][3];
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		// 4. print array
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==============");
		
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				System.out.print(y[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==============");
		
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				System.out.print(z[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
