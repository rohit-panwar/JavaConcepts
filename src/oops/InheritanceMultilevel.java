package oops;

public class InheritanceMultilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pug p1= new Pug();
		p1.run();
		p1.bark();
		p1.size();
	}
}

class Animal{
	
	void run() {
		System.out.println("Animal: Run");
	}
}

class Dog extends Animal{
	
	void bark() {
		System.out.println("Dog: BARK");
	}
}

class Pug extends Dog{
	
	void size() {
		System.out.println("Pug: SIZE");
	}
}