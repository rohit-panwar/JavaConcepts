package oops;

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
		this.age=age;
		this.color=color;
		this.breed=breed;
	}

	public static void main(String[] args) {
		/*
		 * Class is a collection of Objects. It is a Blueprint. It is not a real world
		 * entity. Hence it doesn't occupy the memory.
		 */

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
