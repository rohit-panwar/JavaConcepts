package otherJavaConcepts;

public class P24_HDFCBank extends P24_Bank{

	@Override
	public void credit() {
		System.out.println("HDFC --- Credit");
	}
	
	public void loan() {
		System.out.println("HDFC --- Loan");
		min_bal= min_bal+200;
		max_bal=max_bal+200;
		//charge=charge+200;
	}
	
	public void funds() {
		System.out.println("HDFC --- Funds");
	}
	
	public static void main(String []args) {
		System.out.println("*** HDFC Object ***");
		P24_HDFCBank hd= new P24_HDFCBank();
		hd.credit();
		hd.loan();
		hd.funds();
		hd.debit();
		
		System.out.println("*** Bank Object ***");
		P24_Bank b= new P24_HDFCBank();
		b.credit();
		b.debit();
		b.loan();
		//b.fund(); // Not able to access method of child class
		
	}

}
