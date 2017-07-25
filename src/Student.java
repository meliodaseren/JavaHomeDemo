public class Student {
	// 定義屬性score
	int score;
	
	public void play(int hours) {
		// 每玩樂一個小時，score就會減1
		System.out.println("玩樂" + hours + "小時後，分數變成" + (score - hours) + "。");
	}
	
	public void study(int hours) {
		// 每讀書一個小時，score就會加1
		System.out.println("讀書" + hours + "小時後，分數變成" + (score + hours) + "。");
	}
	
	/* Test */
	public static void main(String args[]) {
		
		Student Alan = new Student();
		Alan.score = 75;				// 設定初始分數
		
		Student Eddie = new Student();
		Eddie.score = 70;
		
		Alan.play(6);
		Alan.study(10);
		
		System.out.println();
		
		Eddie.play(8);
		Eddie.study(8);		
	}
	
}