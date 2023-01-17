package oops;

public class InheritanceSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================ Vehicle Object =================");
		Vehicle v1= new Vehicle();
		v1.start();
		v1.engine();
		//v1.stop(); // can't access method 
		
		System.out.println("================ Car Object =================");
		Car c1= new Car();
		c1.start();
		c1.engine();
		c1.stop();
		
		System.out.println("================ Vehicle Object Referred to Car =================");
		Vehicle v2= new Car();
		v2.start();
		v2.engine();
		//v2.stop(); // Only common method can be accessed
		
		System.out.println("================ Car Object Referred to Vehicle =================");
		Car c2= (Car)new Vehicle(); // Class cast exception
		c2.start();
		c2.engine();
	}

}

class Vehicle{
	
	void start(){
		System.out.println("Vehical Start");
	}
	
	void engine() {
		System.out.println("Vehical Engine");
	}
}

class Car extends Vehicle{
	
	void start() {
		System.out.println("Car Start");
	}
	
	void stop() {
		System.out.println("Car Stop");
	}
}
