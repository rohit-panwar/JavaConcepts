package oops;

public class Inheritance_Restrict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("================ Bird =============");
		Bird b= new Bird();
		b.fly();
		
		System.out.println("================ Eagle =============");
		Eagle e= new Eagle();
		e.fly();
		e.hunt();
	}

}

class Bird { // Make it private to restrict inheritance
	void fly() {
		System.out.println("Bird: Fly");
	}
}

class Eagle extends Bird{
	void hunt() {
		System.out.println("Eagle: Hunt");
	}
}