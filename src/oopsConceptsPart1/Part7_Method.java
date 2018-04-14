package oopsConceptsPart1;

public class Part7_Method {

	public static void main(String[] args) {
		Part7_Method p = new Part7_Method();
		
		p.getTitle();
		
		int i=p.getLeasePrimeNumber();
		System.out.println("LPN: "+i);
		
		String s=p.getSubject();
		System.out.println("Subject is: "+s);
		
		int k=p.getMultipication(10, 20);
		System.out.println("Multipication is: "+k);
	}
	
	public void getTitle() {
		System.out.println("*** This is a demo of mathematics operations***");
	}
	
	public int getLeasePrimeNumber() {
		System.out.println("*** Logic to calculate lease prime number ***");
		int a=1;
		return a;
	}
	
	public String getSubject() {
		System.out.println("*** Finding Subject ***");
		return "Selenium";
	}
	
	public int getMultipication(int x, int y) {
		System.out.println("*** Logic to perform multipication of 2 number ***");
		return x*y;
	}

}
