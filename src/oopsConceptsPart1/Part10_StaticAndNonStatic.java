package oopsConceptsPart1;

public class Part10_StaticAndNonStatic {

	String fname="Payal";
	static String lname="Panwar";
	
	int salary=25000;
	static int expend=10000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Part10_StaticAndNonStatic pp=new Part10_StaticAndNonStatic();
		
		System.out.println(pp.fname);
		System.out.println(lname);
		System.out.println(Part10_StaticAndNonStatic.lname);
		
		System.out.println(pp.salary);
		System.out.println(expend);
		System.out.println(Part10_StaticAndNonStatic.expend);
		
		pp.test();
		pass();
		Part10_StaticAndNonStatic.pass();
	}
	
	public void test() {
		System.out.println("This is non-static method");
	}
	
	public static void pass() {
		System.out.println("This is static method");
	}

}
