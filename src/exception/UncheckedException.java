package exception;

public class UncheckedException {

	public static void main(String[] args) {

		int a = 100;
		int b = 0;
		int c;

		try {
			System.out.println("Before Exception");
			c = a / b;
			System.out.println(c);
			System.out.println("After Exception");
		}

		catch (ArithmeticException e) {
			System.out.println("----------------------");
			e.printStackTrace();
			System.out.println("----------------------");
			System.out.println(e);
			System.out.println("----------------------");
			System.out.println(e.getMessage());
			System.out.println("----------------------");
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * We can't declare Parent Class Exception before child Class Exception. It will
		 * give error: Unreachable catch block for ArithmeticException. It is already
		 * handled by the catch block for Exception
		 */

		System.out.println("End of Program");
	}

}
