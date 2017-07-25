package TempTest;


public class RandomTest {

	public static void main(String[] args) {
		
		long startTime =  System.currentTimeMillis();
		
		int x;
		int i = 0;
		
		while(i < 10) {
			for(int j = 1; j <= 10; j++) {
				x = (int) ((Math.random() * 100) % 3);
//				x = (int) ((Math.random() * 7) % 3);
				System.out.print(x + " ");
			}
			i++;
			System.out.println();
		}
		
		long endTime = System.currentTimeMillis();
		long Time = endTime - startTime;
		System.out.println("執行時間：" + Time + "毫秒");
		
	}

}
