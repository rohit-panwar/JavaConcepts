package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {
		// It is mandatory to add try-catch/try-finally block or throws an exception for
		// CheckedExpection. Without this program will not complie

		/*
		 * Exception object will be created by the method under which exception is
		 * trigger. And it will be passed to JVM. Later on JVM will check that whether
		 * it is handled by method (or by calling method). If not then it will
		 * abnormally terminated the program and "Default Exception Handler" will
		 * display the exception.
		 */

		/*
		 * Exception object has 3 parts: 1. Exception Class Name 2. Exception
		 * Description 3. Stack Trace
		 */
		try {
			System.out.println("Before Checked Exception");
			FileInputStream fis = new FileInputStream("C:\\test.txt"); // FileNotFoundException
			System.out.println("After Checked Exception");
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("Finally: Clean Up Activity");
		}
		System.out.println("::End of Program::");
	}

}
