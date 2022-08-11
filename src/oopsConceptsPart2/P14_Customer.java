package oopsConceptsPart2;

public class P14_Customer {

	public static void main(String[] args) {
		
		System.out.println(P14_USGovt.min_bal); // cant change the value
		
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
		
		System.out.println("******* HDFC Bank Object refereed by Imterface ref variable **********");
		// Dynamic polymarphism, only overiden method will be called
		P14_USGovt u= new P14_HDFCBank();
		u.credit();
		u.debit();
		u.transfer();
		//u.imps(); 	
	}

}
