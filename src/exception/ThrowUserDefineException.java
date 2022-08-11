package exception;

public class ThrowUserDefineException {

	public static void main(String[] args) {

		int age = 16;

		try {
			if (age < 18)
				throw new UnderAgeException();
		} catch (UnderAgeException e) {
			e.printStackTrace();
		}
		System.out.println("End of Program #1");

		try {
			if (age < 18)
				throw new UnderAgeException("I am Under age");
		} catch (UnderAgeException e) {
			e.printStackTrace();
		}
		System.out.println("End of Program #2");
	}

}
