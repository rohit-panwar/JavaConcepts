package otherJavaConcepts;

public abstract class P24_Bank { // Abstract Class

	static int min_bal=100;
	int max_bal=200;
	final int charge=300;
	
	
	public abstract void credit();
	
	public void debit() {
		System.out.println("Bank --- Debit");
	}
	public void loan() {
		System.out.println("Bank --- Loan");
	}
	
}
