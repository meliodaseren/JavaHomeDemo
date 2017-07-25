public class Student02 {
	
	int score = 80;
	
	public void play(int hours) {
		score -= hours;
	}

	public void study(int hours) {
		score += hours;
	}

	/* Test */
	public static void main(String[] args) {
		
		Student02 dolly = new Student02();
		dolly.study(12);
		dolly.play(3);
		System.out.println(dolly.score);
			
		Student02 david = new Student02();
		david.study(10);
		david.play(3);
		System.out.println(david.score);

	}
}
