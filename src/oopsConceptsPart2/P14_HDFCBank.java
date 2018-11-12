package oopsConceptsPart2;

public class P14_HDFCBank implements P14_USGovt {

	@Override
	public void credit() {
		System.out.println("HDFC : Credit");
		//System.out.println(min_bal);	
	}

	@Override
	public void debit() {
		System.out.println("HDFC : Debit");
		//System.out.println(P14_USGovt.min_bal);
	}
	
	public void IMPS() {
		System.out.println("HDFC : IMPS");
		//System.out.println(P14_USGovt.min_bal);
	}
}
