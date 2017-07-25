package Mod_I;
/*
 * Java_ModuleV p.7
 */
public class TestNineNine {

	public static void main(String[] args) {
		
		/* 九九乘法表 for + for */
		int i, j;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++)
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			System.out.println();
		}
		
		System.out.println("-------------------------------------------");
		
		/* 九九乘法表 for + while */
		int i2;
		for (i2 = 1; i2 <= 9; i2++) {
			int j2 = 1;
			while (j2 <= 9) {
				System.out.print(i2 + "*" + j2 + "=" + i2 * j2 + "\t");
				j2++;
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------");
		
		/* 九九乘法表 for + do…while */
		int i3;
		for (i3 = 1; i3 <= 9; i3++) {
			int j3 = 1;
			do {
				System.out.print(i3 + "*" + j3 + "=" + i3 * j3 + "\t");
				j3++;
			} while (j3 <= 9);
			System.out.println();
		}
		
		System.out.println("-------------------------------------------");
		
		/* 九九乘法表 while + do…while */
		int i4 = 1;
		while (i4 <= 9) {
			int j4 = 1;
			do {
				System.out.print(i4 + "*" + j4 + "=" + i4 * j4 + "\t");
				j4++;
			} while (j4 <= 9);
			System.out.println();
			i4++;
		}

	}

}