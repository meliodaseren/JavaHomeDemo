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
 *	 與TestRandomArray.java、TestRandomArray1.java共用
 */

public class TestRandomArray2 {

	public static void main(String[] args) {
		TestRandomArray2 tra = new TestRandomArray2();		// 建立物件，固方法不用加 static
		int[][] x = tra.getRandomArray();
		int[][] y = tra.getRandomArray();
		// x + y -> z array
		int[][] z = new int[3][3];
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		tra.printRandomArray(x);
		System.out.println("------------------------");	
		tra.printRandomArray(y);
		System.out.println("------------------------");	
		tra.printRandomArray(z);
		
	}
	
	public int[][] getRandomArray() {
		int[][] randomArray = new int[3][3];
		for (int i = 0; i < randomArray.length; i++) {
			for (int j = 0; j < randomArray[i].length; j++) {
				int random = (int)(Math.random() * 31);
				randomArray[i][j] = random;
			}
		}
		return randomArray;
	}
	
	public void printRandomArray(int[][] randomArray) {
		for (int i = 0; i < randomArray.length; i++) {
			for (int j = 0; j < randomArray[i].length; j++) {
				System.out.print(randomArray[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
