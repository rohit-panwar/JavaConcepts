package exception;

public class ThrowUnchekedException {

	public static void main(String[] args) {

		throw new ArithmeticException();
		// System.out.println("Unreachable Code");
		/*
		 * We can't write any statement after throw statement as program control won't be
		 * not able to reach at that location
		 */

	}

}
