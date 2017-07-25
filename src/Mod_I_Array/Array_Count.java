package Mod_I_Array;

public class Array_Count {
	
	/* 計算給定陣列內的數字(1 - 9)出現幾次 */
	
	public static void main(String[] args) {
		
		int[] a = new int[9];
		int[] b = {3, 2, 2, 1, 1, 2, 2, 3, 4, 5, 8, 6, 5, 8, 9};
	    
		for(int i = 0; i < a.length; i++) {
			int count = 0;
			for(int j = 0; j < b.length; j++) {
				if(b[j] == (i + 1)) {
					count++;
				}
			}
			System.out.println((int)(i + 1) + "出現" + (int)count + "次");
	    }
	    
	}

}
