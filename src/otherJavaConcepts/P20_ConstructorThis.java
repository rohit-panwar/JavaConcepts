package otherJavaConcepts;

public class P20_ConstructorThis {
	
	static String name;
	static int age;
	
	public P20_ConstructorThis(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	public static void main(String args[]) {
		P20_ConstructorThis p = new P20_ConstructorThis("Rohit", 30);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
