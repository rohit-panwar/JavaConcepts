package oops;

public class Abstraction_InterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementedClass a= new ImplementedClass();
		a.show();
		a.display();
		Abstraction_Interface.run();
	}
}

class ImplementedClass implements Abstraction_Interface{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("ImplementedClass: Show method implemented");
	}
	
}