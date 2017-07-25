package Mod_I_Array;
/*
 *	請分別建立x, y, z三個3x3的int陣列，
 *	然後再將x和y陣列的加總存放到z陣列裡，再將結果顯示於螢幕上
 *
 *	x和y陣列中的數字：
 *	請用亂數產生介於0～30之間的整數
 *	亂數之取得可參考 java.lang.Math的靜態方法 random()
 *	public static double random()：範圍為0.0～1.0
 *
 *	 與TestRandomArray1.java、TestRandomArray2.java共用
 */

public class TestRandomArray {
	
	public static void main(String[] args) {
		
//		int matrixX[][] = {{1,2,3}, {4,5,6}, {7,8,9}};			
//		int matrixY[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
//		int matrixZ[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

		int[][] matrixX = new int[3][3];
		int[][] matrixY = new int[3][3];
		int sum = 0;
		
		System.out.println("X");
		RandomMatrix(matrixX);
		display(matrixX);
		
		System.out.println("------------------------");	
		
		System.out.println("Y");
		RandomMatrix(matrixY);
		display(matrixY);
		
		System.out.println("------------------------");	
		
		System.out.println("Z = X + Y");
		// x + y -> z array
		int[][] matrixZ = new int[3][3];
		for (int i = 0; i < matrixZ.length; i++) {
			for (int j = 0; j < matrixZ[i].length; j++) {
				matrixZ[i][j] = matrixX[i][j] + matrixY[i][j];
			}
		}
		display(matrixZ);
		
		System.out.println("------------------------");
		
		sum = sum(matrixZ, matrixX, matrixY);
		System.out.println("矩陣Z的元素總和 =" + sum);
		
	}
	
	public static void RandomMatrix(int[][] arrayc) {
		for(int i = 0; i < arrayc.length; i++) {				
			for(int j = 0; j < arrayc[i].length; j++) {
				int r = (int)(Math.random() * 31);
				arrayc[i][j] = r;
			}
		}	
	}
	
	public static int sum(int[][] matrixX,int[][] matrixY, int[][] matrixZ) {
		int	sum = 0;
		for(int i = 0; i < matrixZ.length; i++) {					
			for(int j = 0; j < matrixZ[i].length; j++) {
				matrixZ[i][j] = matrixX[i][j] + matrixY[i][j];
				sum += matrixZ[i][j];	
			}
		 } return sum;
	}
	
	public static void display(int[][] arrayb) {	
		for(int k = 0; k < arrayb.length; k++) {				
			for(int l = 0; l < arrayb[k].length; l++) {
				int t = arrayb[k][l];
				System.out.print(t + "\t");
			}					
		System.out.println();
		}	
	}
	
}
