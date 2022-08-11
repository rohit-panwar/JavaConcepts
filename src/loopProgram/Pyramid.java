package loopProgram;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showPyramid1();
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		showPyramid2();
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		showPyramid3();
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		showPyramid4();
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		showPyramid5();
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		showPyramid6();
		System.out.println(":::::::::::::::::::::::::::::::::::::");
	}

	public static void showPyramid1() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void showPyramid2() {

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void showPyramid3() {

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j >= 0; j--) {
				if (j > i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void showPyramid4() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i > j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void showPyramid5() {

		int k = 0;
		int row = 5;
		for (int i = 1; i < row; ++i, k = 0) {
			for (int j = 1; j <= row - i; ++j) {
				System.out.print("  ");
			}
				while(k!=2*i-1) {
				System.out.print("* ");
				++k;
				}
			
			System.out.println();
		}
	}
	
	public static void showPyramid6() {
		int row=5;
		
		for(int i=0; i<row; i++) {
			for(int j=row-i; j>1; j--)
				System.out.print(" ");
			for(int j=0; j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		
		
		
		
		
		
	}
}