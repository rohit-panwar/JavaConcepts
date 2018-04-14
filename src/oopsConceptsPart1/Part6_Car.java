package oopsConceptsPart1;

public class Part6_Car {

	String model;
	double version;
	int wheel;
	
	public static void main(String[] args) {

		Part6_Car c1= new Part6_Car();
		Part6_Car c2= new Part6_Car();
		Part6_Car c3= new Part6_Car();
		
		c1.model="BMW";
		c1.version=1.2;
		c1.wheel=4;

		c2.model="FERRARI";
		c2.version=5.6;
		c2.wheel=4;
		
		c3.model="Renault";
		c3.version=1.25;
		c3.wheel=4;
		
		System.out.println("Details :: Model: "+c1.model+ " Version: "+c1.version+ " Wheels: "+c1.wheel);
		System.out.println("Details :: Model: "+c2.model+ " Version: "+c2.version+ " Wheels: "+c2.wheel);
		System.out.println("Details :: Model: "+c3.model+ " Version: "+c3.version+ " Wheels: "+c3.wheel);
		
		c1=c2;
		c2=c3;
		c3=c1;
		System.out.println("Details :: Model: "+c1.model+ " Version: "+c1.version+ " Wheels: "+c1.wheel);
		System.out.println("Details :: Model: "+c2.model+ " Version: "+c2.version+ " Wheels: "+c2.wheel);
		System.out.println("Details :: Model: "+c3.model+ " Version: "+c3.version+ " Wheels: "+c3.wheel);
	}

}
