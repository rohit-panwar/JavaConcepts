package oops;

public class InheritanceMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class WaterAnimal{
	void eat() {
		System.out.println("Eat in Water");
	}
}

class LandAnimal{
	void eat() {
		System.out.println("Eat at Land");
	}
}

class Crocodile extends WaterAnimal, LandAnimal{
	System.out.println("Crocodile");
}