package oops;

/*
 * Encapsulation in Java is a process of wrapping code and data together into a single unit, 
 * for example, a capsule which is mixed of several medicines.
 * 
 * We can create a fully encapsulated class in Java by making all the data members of the class private. 
 * Now we can use setter and getter methods to set and get the data in it.
 */
public class Encapsulation {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
