package Homework;

public class HW_04_Adv02 {
	
	public static void main(String[] args) {
		
		/* 進階題2 */
		/* 班上有8位同學，他們進行了6次考試結果如下：
		 * 請算出每位同學考最高分的次數 (提示：二維陣列) */
		int[] student = {1, 2, 3, 4, 5, 6, 7, 8};	// 學生編號陣列
		int[][] grade = {{10, 35, 40, 100,90, 85, 75, 70},	// 第一次考試	100	[3] -> Student No.4
						 {37, 75, 77, 89, 64, 75, 70, 95},	// 第二次考試	95	[7] -> Student No.8
						 {100,70, 79, 90, 75, 70, 79, 90},	// 第三次考試	100	[0] -> Student No.1
						 {77, 95, 70, 89, 60, 75, 85, 89},	// 第四次考試	95	[1] -> Student No.2
						 {98, 70, 89, 90, 75, 90, 89, 90},	// 第五次考試	98	[0] -> Student No.1
						 {90, 80, 100,75, 50, 20, 99, 75}};	// 第六次考試	100	[2] -> Student No.3
		
		System.out.println("班上有" + grade[0].length + "位同學，他們進行了" + grade.length + "次考試。");	// 第一列的行數
		
		System.out.println("------------------------");
		
		/* 步驟一：透過一一比較，計算出每次考試的最高分，並將其輸出成 1×6 陣列 */
		int[] max_temp = new int[6];			// 六次考試裡，每次考試的最高分陣列
		
		for(int i = 0; i < grade.length; i++) {
			max_temp[i] = grade[i][0];			// 先設一維陣列的首位為最大值
			for(int j = 1; j < grade[0].length; j++) {
				if(grade[i][j] > max_temp[i]) {
					max_temp[i] = grade[i][j];	// 若下一位比前一位大則取代前一位
					continue;					// 可以不加 continue
					// NOTE：如果用 break 會輸出：35 75 100 95 98 100，只要比前一位高就跳出迴圈
				}
			}
			System.out.println("第" + (int)(i + 1) + "次考試，最高分" + max_temp[i] + "分");	// 輸出每次考試的最高分
		}
			// 步驟一階段最後的陣列內容：max_temp = {100, 95, 100, 95, 98, 100}
		System.out.println("------------------------");
		
		/* 步驟二：算出每次考試最高分對照的相對索引值(即學生編號)，並將其輸出成 1×6 陣列 */
		int[] max_student_no = new int[6];
		
		for(int i = 0; i < max_temp.length; i++) {
			
			int student_no_count = 0;
			for(int j = 0; j < grade[0].length; j++) {	// 從第一次考試開始，計算最高分符合的分數。
				if(max_temp[i] == grade[i][j]) {		// 透過計數算出其(最高分)在陣列(第一次考試)中的相對索引值。
					break;								// 若符合就跳出(break)迴圈
				} else {
					student_no_count++;					// 若未符合最高分則計數
				}
			}
			max_student_no[i] += student_no_count;			// 將計數結果丟進陣列，形成每次考試最高分學生的陣列
		}
			// 步驟二階段最後的陣列內容：student_no = {3, 7, 0, 1, 0, 2}，內容值為學生編號的索引值(學生編號-1)
		
		/* 步驟三：計算相對索引值(學生編號-1)陣列中，索引值出現的次數 */
			// student_no = {3, 7, 0, 1, 0, 2}			// 最高分次數陣列
			//	  student = {1, 2, 3, 4, 5, 6, 7, 8}	// 行10中的學生編號陣列
			// student[?] = [0, 1, 2, 3, 4, 5, 6, 7]	// 對照索引值陣列
			// 比較行57中的學生編號索引值在行55中出現幾次
				// 0出現2次 -> Student No.1 考過2次最高分
				// 1出現1次 -> Student No.2 考過1次最高分
				// 2出現1次 -> Student No.3 考過1次最高分
				// 3出現1次 -> Student No.4 考過1次最高分
				// 7出現1次 -> Student No.8 考過1次最高分
		for(int i = 0; i < student.length; i++) {	// 從1號[0]學生開始比對
			int count = 0;		// 計數
			for(int j = 0; j < max_student_no.length; j++) {
				if(max_student_no[j] == i) {	// 開始比對是否符合最高分(6次考試)
					count++;	// 1號[0]學生符合第3[2]、4[3]次中的最高分，迴圈結束計數2次
				}
			}
			System.out.println("學生" + (int)(i + 1) + "號考過最高分的次數是：" + (int)count + "次");
			// (i+1)從索引值修正為學生真實編號
	    }

	}

}