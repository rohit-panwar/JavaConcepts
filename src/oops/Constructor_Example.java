package oops;

public class Constructor_Example {

	String name;
	int age;

	/*
	 * Constructor is a block similar to method and has a same name as that class
	 * name. It doesn't return anything not even void. Applicable access modifiers
	 * are Public, Protected, Private & Default. And it is called automatically when
	 * we create an object. Constructor is created to initialize the variable.
	 */

	public Constructor_Example() {
		/*
		 * This is a default constructor. It is a no-argument constructor. If user don't
		 * provide then Compiler will create this.
		 */
		System.out.println("Default Constructor is called.");
	}

	Constructor_Example(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}

	public static void main(String[] args) {
		Constructor_Example c1 = new Constructor_Example("Roh", 18);
		Constructor_Example c2 = new Constructor_Example("Krish", 1);
		Constructor_Example c3 = new Constructor_Example();
		/*
		 * This will throw an exception if use doesn't create default constructor. As
		 * compiler will only create no-argument constructor if a class does not contain
		 * any constructor.
		 */

		c1.display();
		c2.display();
	}

}
