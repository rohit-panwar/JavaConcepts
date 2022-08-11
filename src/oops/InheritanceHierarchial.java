package oops;

public class InheritanceHierarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=============== Circle Object =================");
		Circle c1= new Circle();
		c1.area();
		c1.diameter();
		
		System.out.println("=============== Square Object =================");
		Square s1= new Square();
		s1.area();
		s1.squareroot();
	}

}

class Shape{
	void area() {
		System.out.println("Area of Shape");
	}
}

class Circle extends Shape{
	void diameter() {
		System.out.println("Circle Diameter");
	}
}

class Square extends Shape{
	void squareroot() {
		System.out.println("Square Squareroot");
	}
}