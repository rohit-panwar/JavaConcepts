package oopsConceptsPart2;

public class P13_CarTest {

	public static void main(String[] args) {

		System.out.println("***** BMW OBJECT REF to BMW *****");
		P13_BMW b = new P13_BMW();
		b.start(); // Static polymorphism or compile time Polymorphism 
		b.stop();
		b.refuel();
		b.theftSafty();
		b.engine();
		b.voiceNavigation();
		
		System.out.println("***** CAR OBJECT REF to CAR *****");
		P13_Car c = new P13_Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		c.theftSafty();
		
		System.out.println("***** CAR OBJECT REF to BMW *****");
		P13_Car c1= new P13_BMW(); // Top Casting or Dynamic Polymorphism or Run time Polymorphism
		// child class object can be refereed by parent class reference variable
		c1.start(); // Only Parent method and common method can be accessed
		c1.stop();
		c1.refuel();
		c1.engine();
		c1.theftSafty();
		
		System.out.println("***** BMW OBJECT REF to CAR *****");
		P13_BMW b1= (P13_BMW)new P13_Car(); // DownCasting; Run time exception..  java.lang.ClassCastException
		b1.start();
		b1.stop();
		b1.refuel();
		b1.theftSafty();
	}

}
