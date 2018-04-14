package otherJavaConcepts;

public class P20_Constructor {

	public P20_Constructor() {
		System.out.println("Dafault Constructor");
	}
	
	public P20_Constructor(int i) {
		System.out.println("Single Param Constructor");
	}
	
	public P20_Constructor(int i, int j) {
		System.out.println("Two Param Constructor");
	}
	
	public static void main(String args[]) {
		P20_Constructor c1= new P20_Constructor();
		P20_Constructor c2= new P20_Constructor(10);
		P20_Constructor c3= new P20_Constructor(100,200);
	}
}
