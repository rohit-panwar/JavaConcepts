package javaBasics;

public class Part2StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;
		int j=20;
		
		double d1=11.11;
		double d2=22.22;
		
		//char a='X';
		//char b='z';
		
		String s1="Hello";
		String s2="World";
		
		System.out.println(i+j);
		System.out.println(i+j+d1);
		System.out.println(i+j+d1+d2);
		
		System.out.println(d1+d2);
		System.out.println(d1+d2+i);
		System.out.println(d1+d2+i+j);
		
		System.out.println(i+j+s1);
		System.out.println(i+j+s1+s2);
		System.out.println(d1+d2+s1);
		System.out.println(d1+d2+s1+s2);
		
		System.out.println(s1+i+j+s1);
		System.out.println(s1+s2+i+j+s1+s2);
		System.out.println(s1+d1+d2+s1);
		System.out.println(s1+s2+d1+d2+s1+s2);
		
		System.out.println(s1+(i+j)+s1);
		System.out.println(s1+s2+(i+j)+s1+s2);
		System.out.println(s1+(d1+d2)+s1);
		System.out.println(s1+s2+(d1+d2)+s1+s2);
	}

}
