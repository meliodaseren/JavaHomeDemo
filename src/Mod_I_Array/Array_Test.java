package Mod_I_Array;

public class Array_Test {
	
	public static void main(String[] args) {
		
		int[] scores = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};

		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("總平均" + sum / scores.length + "分");
		
		
		System.out.println("-------------------------------------------");
		
		
		int[][] count = {{29, 100, 39}, {41, 50, 8}, {66, 77, 95, 15}};
						// 甲、乙、丙三位同學：國文、英文、數學三科的成績
		int total = 0;
		
		for(int i = 0; i < count.length; i++) {
			total = 0;
			for(int j = 0; j < count.length; j++) {
				total += count[i][j];
			}
		}
		double average = total / count.length;
		System.out.println(average);
	}

}
