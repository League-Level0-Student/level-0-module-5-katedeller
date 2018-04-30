
public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		for (int x = 100; x > 0; x--) {
			System.out.println(x);
		}
		for (int k = 0; k < 100; k++) {
			if (k % 2 == 0)
				System.out.println(k);
		}
		for (int j = 0; j < 100; j++) {
			if (j % 2 == 1)
				System.out.println(j);
		}
		for (int i = 0; i < 500; i++) {
			if (i % 2 == 0)
				System.out.println(i + " Even");
			if (i % 2 == 1)
				System.out.println(i + " Odd");
		}
		for (int i = 0; i < 778; i += 7) {
			System.out.println(i);
		}
		for (int i = 2001; i < 2018; i++) {
			System.out.println("In " + i + " I was " + (i - 2001) + " years old.");
		}
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++)
				System.out.println(i + " " + k);
		}
		for (int i = 1; i < 9; i += 3) {
			for (int q = 0; q < 3; q++) {
				System.out.print(i + q);
			}
			System.out.print("\n");
		}

		for (int i = 1; i < 100; i += 10) {
			for (int q = 0; q < 10; q++) {
				System.out.print(i + q + " ");
			}
			System.out.print("\n");
		}
		for (int i = 1; i < 6; i ++) {
			for (int q = 0; q <i ; q++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	
	for(int i= 0; i<100; i++)
		System.out.println(100-i);
}}
