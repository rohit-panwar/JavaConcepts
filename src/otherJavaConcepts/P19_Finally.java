package otherJavaConcepts;

public class P19_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 testFinally1();
		 testFinally2();
		testFinally3();
	}

	public static void testFinally1() {
		try {
			System.out.println("In Try Block");
			throw new RuntimeException("test");

		} catch (Exception e) {
			System.out.println("In Catch Block");
		} finally {
			System.out.println("In Finally Block");
		}
	}

	public static void testFinally2() {
		try {
			System.out.println("In Try Block");
		} finally {
			System.out.println("In Finally Block");
		}
	}

	public static void testFinally3() {
		try {
			System.out.println("In Try Block");
			int i = 100;
			int k = i / 0;
			System.out.println("Exception Occured");
		} catch (ArithmeticException e) {
			System.out.println("In Catch Block");
		} finally {
			System.out.println("In Finally Block");
		}
	}

}
