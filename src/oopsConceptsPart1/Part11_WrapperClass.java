package oopsConceptsPart1;

public class Part11_WrapperClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="100";
		String s2="FALSE";
		String s3="111.120";
		
		int a=100;
		boolean b= true;
		char c= 'X';
		double d=11.120;
		
		System.out.println(s1+10);
		System.out.println(Integer.parseInt(s1)+10);
		System.out.println(Boolean.parseBoolean(s2));
		System.out.println(Double.parseDouble(s3)+10);
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));
		
		if(Boolean.parseBoolean(s2))
			System.out.println("*True*");
		else
			System.out.println("*FALSE*");
		
		if(s2.equals("FALSE"))
			System.out.println("*True*");
		else
			System.out.println("*FALSE*");
		
	}

}
