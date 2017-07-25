package TempTest;
/* Knuth shuffle */

import java.util.Random;

public class KnuthShuffle {
	 
	public static final Random gen = new Random();
	 
	// version for array of ints
	public static void shuffle (int[] array) {
	    int n = array.length;
	    while (n > 1) {
	        int k = gen.nextInt(n--);	//decrements after using the value
	        int temp = array[n];
	        array[n] = array[k];
	        array[k] = temp;
	    }
	}
	
//    static void shuffle2(int[] array) {
//        int n = array.length;
//        for (int i = 0; i < array.length; i++) {
//            // Get a random index of the array past i.
//            int random = i + (int) (Math.random() * (n - i));
//            // Swap the random element with the present element.
//            int randomElement = array[random];
//            array[random] = array[i];
//            array[i] = randomElement;
//        }
//    }
	
	// version for array of references
	public static void shuffle (Object[] array) {
	    int n = array.length;
	    while (n > 1) {
	        int k = gen.nextInt(n--);	//decrements after using the value
	        Object temp = array[n];
	        array[n] = array[k];
	        array[k] = temp;
	    }
	    
//        int[] values = { 100, 200, 10, 20, 30, 1, 2, 3 };
//        // Shuffle integer array.
//        shuffle2(values);
//
//        // Display elements in array.
//        for (int value : values) {
//            System.out.println(value);
//        }
	}

}
