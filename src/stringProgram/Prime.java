package stringProgram;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int flag = 0;

		for (int i = 1; i <= n; i++, flag = 0) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					flag++;

				if (flag > 2)
					break;
			}
			if (flag == 2)
				System.out.println("Prime No: " + i);
		}
	}

}
