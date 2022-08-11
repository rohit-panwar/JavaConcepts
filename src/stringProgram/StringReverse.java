package stringProgram;

public class StringReverse {

	public static void main(String[] args) {

		String s = "Welcome to the Jungle";
		reverseStr1(s);
		reverseStr2(s);

	}

	public static void reverseStr1(String s) {

		int len = s.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse: " + rev);

	}

	public static void reverseStr2(String s) {

		int len = s.length();

		for (int i = len - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
