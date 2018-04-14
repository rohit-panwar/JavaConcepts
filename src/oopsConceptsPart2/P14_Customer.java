package oopsConceptsPart2;

public class P14_Customer {

	public static void main(String[] args) {
		
		System.out.println("******* ICICI Bank Object**********");
		P14_ICICIBank ic= new P14_ICICIBank();
		ic.credit(); // Overridden method
		ic.debit();  // Overridden method
		ic.locker(); // Own method
		ic.transfer(); // Default method
		P14_USGovt.NEFT(); // Static method
		ic.carLoan();
	
		System.out.println("******* HDFC Bank Object**********");
		P14_HDFCBank hd= new P14_HDFCBank();
		hd.credit();
		hd.debit();
		hd.IMPS();
		hd.transfer();
		P14_USGovt.NEFT();
		
		P14_USGovt us= (P14_USGovt) new P14_Customer();
		us.credit();
		us.debit();
		us.transfer();		
	}

}
