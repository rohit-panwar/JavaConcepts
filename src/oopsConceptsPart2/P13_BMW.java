package oopsConceptsPart2;

public class P13_BMW extends P13_Car { // has a relationship

	public void start() { // Over-ridden method
		System.out.println("BMW --- Start");
	}
	
	public void theftSafty() {
		System.out.println("BMW --- TheftSafty");
	}
	
	public void voiceNavigation() {
		System.out.println("BMW --- Voice-Navigation");
	}
	
	int i=200;
}
