package Mod_I;

public class Test4Numbers {

	public static void main(String[] args) {
		
		/* do…while */
		int i = 0;
		do {
			System.out.print(i * 4 + "\t");
			i++;
		} while (i <= 25);
		
		System.out.println("\n" + "-----");
		
		/* while */
		int i2 = 0;
		while (i2 <= 25) {
			System.out.print(i2 * 4 + "\t");
			i2++;
		}
		
		System.out.println("\n" + "-----");
		
		/* for */
        for (int i3 = 0; i3 <= 25; i3++) {		// 100 / 4 = 25
              System.out.print(i3 * 4 + "\t");
        }
        
        System.out.println("\n" + "-----");
        
        /* for 02 */
        for (int i4 = 0; i4 <= 100; i4++) {
        	if (i4 % 4 == 0) {					// 如果整除4，則print
        		System.out.print(i4 + "\t");
        	}
        }

        System.out.println("\n" + "-----");

        /* for 03 */
        for (int i5 = 0; i5 <= 100; i5+=4) {	// 每次遞增4
        		System.out.print(i5 + "\t");
        }

	}

}
