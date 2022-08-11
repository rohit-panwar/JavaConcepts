package oops;

public class Abstraction_AbstractClass {
	
	// Abstraction is the process of hiding certain details and showing only essential information to the user
	// Using abstract class 0 to 100% abstraction can be achieved.
	// Abstract keyword is required for method & class
	// Only method declaration is required. Method defination is not required.
	// Can not create object of abstract class
	// Abstract method need to be extended and all abstract method should be defined in derived class
	public static void main(String[] args) {
		
		// Furniture f= new Furniture() ; // Cannot create object of abstract class
		Bed b= new Bed();
		b.outdoorFurniture();
		b.woodType();
	}

}

abstract class Furniture{
	abstract void woodType();
	void outdoorFurniture() {
		System.out.println("outdoorFurniture: Non Abstract Method of Furniture Class");
	}
}

class Bed extends Furniture{

	@Override
	void woodType() {
		System.out.println("woodType: Abstract method defination in derived(Bed) class");
	}
	
}