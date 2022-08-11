package oops;

public interface Abstraction_Interface {

	// Using interfaces 100% abstraction can be achieved
	// Methods and datatype(fields) can be defined in interfaces
	// All methods are abstract in interfaces
	// No need to add Abstract keyword in method. By default it is considered as "public abstract"
	// From Java 8: We can create default method.
	// From Java 8: We can create static method. (it will be considered as public by default)
	// From Java 9: We can create private method
	// DataType will be by default "public static final"
	
	void show();
	
	default void display() {
		System.out.println("Interface: Default method");
	}
	
	static void run() {
		System.out.println("Interface: Static method");
	}
}
