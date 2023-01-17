package stringProgram;

public class WordReverse {

	public static void main(String[] args) {

		String s = "Welcome To The Jungle Lion Tiger";

		System.out.println("ORIGINAL >> " + s);
		pattern1(s);
		pattern2(s);
		pattern3(s);

	}

	public static void pattern1(String s) {

		StringBuffer sb = new StringBuffer(s);
		System.out.println("REVERSE >>" + sb.reverse());
	}

	public static void pattern2(String s) {
		String[] str = s.split(" ");
		int len = str.length;

		System.out.print("REVERSE WORD >>");
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(str[i] + " ");
		}
	}

	public static void pattern3(String s) {
		System.out.println();
		String[] str = s.split(" ");
		StringBuilder sb;
		System.out.println("REVERSE WORD >>");

		for (String ss : str) {
			sb = new StringBuilder(ss);
			System.out.print(sb.reverse() + " ");
		}
	}

}
