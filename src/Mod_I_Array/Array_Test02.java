package Mod_I_Array;

public class Array_Test02 {

//	static void sum_length(int[] seats) {
//		for(int i = 0; i < seats.length; i++) {
//			seats[i].length;
//		}
//	}
	
	public static void main(String[] args) {
		
		int[][] seats = new int[5][];
		seats[0] = new int[6];
		seats[1] = new int[6]; 
		seats[2] = new int[6];
		seats[3] = new int[6];
		seats[4] = new int[1];
		// [0 - 3][0 - 5] | [4][0]
		
		System.out.println(seats.length);	// 共5行

//		for(int i = 0; i < sum_length; i += seats[i].length) {
//			for(int j = 0; j < seats[i].length; j++) {
//				seats[i][j] = j + 1;
//				System.out.print(seats[i][j] + " ");
//			}
//		System.out.println();
//		}
	}
	
}
