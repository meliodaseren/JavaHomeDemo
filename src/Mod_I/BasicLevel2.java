package Mod_I;

public class BasicLevel2 {
	public static void main(String[] args) {
		int score = 90;
		int quotient = score / 10;
		char level;
		switch(quotient) {
			case 10:
			case 9:
				level = 'A';
				break;
			case 8:
				level = 'B';
				break;
			case 7:
				level = 'C';
				break;
			case 6:
				level = 'D';
				break;
			default:
				level = 'E';
		}
		System.out.println("得分等級："+level);
	}

}
