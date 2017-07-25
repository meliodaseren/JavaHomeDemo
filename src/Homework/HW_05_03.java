package Homework;

/* 3 */
/* 利用Overloading，設計兩個方法double maxElement(int x[][])與
 * double maxElement(double x[][])，可以找出二維陣列的最大值並回傳 */

public class HW_05_03 {
	
	double maxElement(int x[][]) {
		int maxValue = 0;
		for(int i = 0; i < x.length; i++)
			for(int j = 0; j < x[i].length; j++)
				if(x[i][j] > maxValue)
					maxValue = x[i][j];
		return maxValue;
	}
	
	double maxElement(double x[][]) {
		double maxValue = 0;
		for(int i = 0; i < x.length; i++)
			for(int j = 0; j < x[i].length; j++)
				if(x[i][j] > maxValue)
					maxValue = x[i][j];
		return maxValue;
	}

	public static void main(String[] args) {
		
		int[][] intArray = {
				{1, 6, 3},
				{9, 5, 2}
		};
		
		double[][] doubleArray = {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}
		};
		
		HW_05_03 w = new HW_05_03();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
		
	}
}
