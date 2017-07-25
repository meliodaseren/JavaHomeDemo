package Homework;

/* 2 */
/* 請設計一個方法為randAvg()，從10個 0～100(含100)
 * 的整數亂數中取平均值並印出這10個亂數與平均值	*/

public class HW_05_02_randAvg {
	
	public void randAvg() {
		int[] NoArray = new int[10];
		double sum = 0;
		for(int i = 0; i < NoArray.length; i++) {
			// 生成亂數至陣列
			NoArray[i] = (int)(Math.random() * 100 + 1);
			System.out.print(NoArray[i] + " ");
			
			sum += NoArray[i];
		}
		System.out.println("\n亂數總和：" + sum);	// 亂數總和
		
		double Avg = sum / NoArray.length;
		System.out.println("亂數平均：" + Avg);	// 亂數平均
	}
	
	public static void main(String[] args) {
		// 建立物件並呼叫方法
		HW_05_02_randAvg PrintRandAvg = new HW_05_02_randAvg();
		PrintRandAvg.randAvg();
	}
}
