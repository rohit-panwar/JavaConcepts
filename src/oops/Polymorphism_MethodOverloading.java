package oops;

public class Polymorphism_MethodOverloading {

	// Overloading will be performed in the same class
	// Method name should be same
	// Argument should be different or Sequence should be changed
	// Return type can be or not be same. There is no impact to achieving the overloading.
	void add(int a, int b) {
		System.out.println("Addition: "+(a+b));
	}
	
	void add(int a, int b, int c) {
		System.out.println("Addition: "+(a+b+c));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism_MethodOverloading p= new Polymorphism_MethodOverloading();
		
		p.add(10, 20);
		p.add(10, 20, 30);
		
		p.add(1000, 10, 10, 80); // 1st value is integer. It can be promoted to Float
		p.concatinate("Hello-", 'R');
		p.concatinate('R', "-Hello");
		
		//p.concatinate('a', 'b'); // Unresolved compilation problem- Compiler has ambiguity that for which argument should promote
	}
	
	//Automatic Promotion of Data Type from lower to upper
	void add(float a, int b, int c, int d) {
		System.out.println("Add:"+(a+b+b+d));
	}
	
	// 
	void concatinate (String a, Character b) {
		System.out.println("concatinate: "+a+b);
	}
	
	void concatinate (Character a, String b) {
		System.out.println("concatinate: "+a+b);
	}
}

