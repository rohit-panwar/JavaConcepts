package javaBasics;

public class Part4Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Static array

		// 1. int array
		int i[] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;

		for (int j = 0; j < i.length; j++)
			System.out.println(i[j]);

		// 2. double array
		double d[] = new double[5];
		d[0] = 10.11;
		d[1] = 20.22;
		d[2] = 30.33;
		d[3] = 40.44;
		d[4] = 50.55;

		for (int j = 0; j < d.length; j++)
			System.out.println(d[j]);

		// 3. character array
		char c[] = new char[5];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		c[3] = 'd';
		c[4] = 'e';

		for (int j = 0; j < c.length; j++)
			System.out.println(c[j]);

		// 4. Boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;

		for (int j = 0; j < b.length; j++)
			System.out.println(b[j]);

		// 5. String array
		String s[] = new String[5];
		s[0] = "Mumbai";
		s[1] = "Delhi";
		s[2] = "Pune";
		s[3] = "Hyderabad";
		s[4] = "Banglore";
		
		for (int j = 0; j < s.length; j++)
			System.out.println(s[j]);
		
		// 6. Object Array
		Object obj[]= new Object[6];
		obj[0]="Rohit";
		obj[1]='M';
		obj[2]="14/11/1987";
		obj[3]=98;
		obj[4]="Pune";
		obj[5]=12.55;
		
		for (int j = 0; j < obj.length; j++)
			System.out.println(obj[j]);
	}

}
