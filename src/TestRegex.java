import java.util.Scanner;

public class TestRegex {
	
	public static void main(String[] args) {
		String regex = "[A-Z][1-2]\\d{8}";
//		String regex = "\\p{Alpha}[1-2]\\d{8}";
//		String regex = "[A-Z][1-2][0-9]{8}";
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		String tel = sc.next();
		if(tel.matches(regex)) {
			System.out.println("OK");
		} else {
			System.out.println("No good...");
		}
	}
	
}
