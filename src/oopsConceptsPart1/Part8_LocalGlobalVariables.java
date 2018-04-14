package oopsConceptsPart1;

public class Part8_LocalGlobalVariables {
	
	String name="Rohit";
	int age=30;

	public static void main(String[] args) {

		Part8_LocalGlobalVariables a=new Part8_LocalGlobalVariables();
		a.getName();
		System.out.println(a.name);
		System.out.println(a.age);
	}

	public void getName() {
		int classes=10;
		System.out.println("Inside Name Method");
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Class is: "+classes);
	}
}
