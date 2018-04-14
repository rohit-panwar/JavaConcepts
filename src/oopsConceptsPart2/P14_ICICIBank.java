package oopsConceptsPart2;

public class P14_ICICIBank implements P14_USGovt, P14_BrazilGovt {

	public void credit() { // Overriden method
		System.out.println("ICICI : Credit");
		//System.out.println(min_bal);
	}

	@Override
	public void debit() {
		System.out.println("ICICI : Debit");
		//System.out.println(P14_USGovt.min_bal);
	}
	
	public void locker() {
		System.out.println("ICICI : Locker");
		//min_bal=min_bal+120;  // Can not modify value of variables
		//System.out.println(min_bal);
	}

	@Override
	public void carLoan() {
		System.out.println("ICICI : Car Loan");
		
	}

}
