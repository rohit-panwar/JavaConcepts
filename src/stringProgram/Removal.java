package stringProgram;

public class Removal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "How Hello How Are you You how Hey Welcome Good";

		System.out.println("ORIGINAL >> " + s);
		printDuplicate(s);

	}

	public static void printDuplicate(String s) {
		System.out.println("Duplicate word >> ");
		String[] str = s.split("\\s");

		for (int i = 0; i < str.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					flag = true;
					str[j] = "0";
				}
			}
			if (flag && str[i] != "0")
				System.out.println(str[i]);
		}

	}

}
