package oops;

public class Polymorphism_MethodOverriding {

	// Overriding can be achieved using inheritance.
	// Method name should be same 
	// Arguments should be also same
	// Return type should be also same
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW b= new BMW();
		b.EngineStart();
	}

}

class Cars{
	void EngineStart() {
		System.out.println("Car: Key Start");
	}
}

class BMW extends Cars{
	void EngineStart() {
		System.out.println("BMW: Voice Command Start");
	}
}