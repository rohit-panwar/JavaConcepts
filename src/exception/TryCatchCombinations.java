package exception;

public class TryCatchCombinations {

	public static void main(String[] args) {

		/* try, catch & Finally: Independently can't be provide. it will give error */

		// A try must be followed by catch or finally or both.
		try {

		} catch (Exception e) {

		}
		/***************************************************************************/
		try {

		} finally {

		}
		/***************************************************************************/
		try {

		} catch (Exception e) {

		} finally {

		}
		/* try with multiple catch allowed */
		try {

		} catch (ArithmeticException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}
		/* try with multiple finally not allowed */
		/*
		 * try {
		 * 
		 * } finally {
		 * 
		 * } finally {
		 * 
		 * }
		 */
	}

}
