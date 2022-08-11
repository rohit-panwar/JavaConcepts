package oopsConceptsPart1;

public class Part9_MethodOverloading {

	private static String ture;

	public static void main(String[] args) {

		Part9_MethodOverloading p= new Part9_MethodOverloading();
		p.sum();
		p.sum(1);
		p.sum(1.11);
		p.sum("Selenium");
		p.sum('K');
		p.sum(ture);
		p.sum(10, 20);
	}
	
	public void sum() {
		System.out.println("0 Argument; 0 parameter");
	}
	
	public void sum(int a) {
		System.out.println("0 Argument; int parameter");
	}
	
	public void sum(int a, int b) {
		System.out.println("0 Argument; int-int parameter");
	}

	public void sum(double a) {
		System.out.println("0 Argument; double parameter");
	}
	
	public void sum(String a) {
		System.out.println("0 Argument; string parameter");
	}
	
	public void sum(char a) {
		System.out.println("0 Argument; char parameter");
	}
	
	public void sum(Boolean a) {
		System.out.println("0 Argument; boolean parameter");
	}
}
