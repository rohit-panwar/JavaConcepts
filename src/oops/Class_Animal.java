package oops;

/*
 * Class is a collection of Objects. It is a Blueprint. It is not a real world
 * entity. Hence it doesn't occupy the memory.
 * There are four types of Java access modifiers:

Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.
 */
public class Class_Animal {

	// create variables (Object State/Attribute)
	int age;
	String color;
	String breed;

	// create method (Object Behavior)
	public void eat() {
		System.out.println("Method: Eating");
	}

	public void getAnimal() {
		System.out.println("Age: " + age + ", Breed: " + breed + ", Color: " + color);
	}

	public void setAnimal(int age, String color, String breed) {
		this.age = age;
		this.color = color;
		this.breed = breed;
	}

	public static void main(String[] args) {

		// Create an Object (Object Identify)
		// Declaration-Instantiation-Initialization
		Class_Animal buzo = new Class_Animal();
		/*
		 * Object is an instance of Class. It is a real world entity. Hence it occupies
		 * the memory.
		 */

		// Object Initialization using Reference Variable
		buzo.age = 5;
		buzo.color = "White";
		buzo.breed = "Husky";

		buzo.eat();
		buzo.getAnimal();

		// Object Initialization using Method
		buzo.setAnimal(2, "Black", "Pug");
		buzo.getAnimal();

	}

}
