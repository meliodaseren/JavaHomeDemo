package Mod_I;

public class TestBMI {
	
	public static void main(String[] args) {
		double height = 1.70, weight = 69;
		double bmi = weight / Math.pow(height, 2);

		// float表示
		// float height2 = 1.7F; 
		
		System.out.println(bmi);
		
		if(bmi < 18.5) {
			System.out.println("過瘦");
		} else if(bmi >= 24) {
			System.out.println("過胖");
		} else {
			System.out.println("正常");
		}
		
		if(bmi < 18.5) {
			System.out.println("過瘦");
		} else if(bmi >= 18.5 && bmi < 24) {
			System.out.println("正常");
		} else {
			System.out.println("過胖");
		}
		
	}
}
