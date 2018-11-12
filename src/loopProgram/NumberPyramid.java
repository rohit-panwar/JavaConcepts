package loopProgram;

public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pyramid1();
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		pyramid2();
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		pyramid3();
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		pyramid4();
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		pyramid5();
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		pyramid6();
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		pyramid7();
		System.out.println(":::::::::::::::::::::::::::::::::::::");
	}

	public static void pyramid1() {
		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}

	public static void pyramid2() {
		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
	}

	public static void pyramid3() {
		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 5; j > 0; j--) {
				if (j > i)
					System.out.print("  ");
				else
					System.out.print(" "+j);
			}
			System.out.println(" ");
		}
	}
	
	public static void pyramid4() {
		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 5; j > 0; j--) {
				if (j > i)
					System.out.print("  ");
				else
					System.out.print(" "+i);
			}
			System.out.println(" ");
		}
	}

	public static void pyramid5() {
		int row = 5;
		for (int i = row; i >0; i--) {
			for (int j = i; j > 0; j--) {
					System.out.print(" "+i);
			}
			System.out.println(" ");
		}
	}
	
	public static void pyramid6() {
		int row = 5;
		for (int i = row; i >0; i--) {
			for (int j = row; j > 0; j--) {
				if (j > i)
					System.out.print("  ");
				else
					System.out.print(" "+i);
			}
			System.out.println(" ");
		}
	}
	
	public static void pyramid7() {
		int row = 4; int k=1;
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=i; j++) {
					System.out.print(" "+k++);
			}
			System.out.println(" ");
		}
	}
}
