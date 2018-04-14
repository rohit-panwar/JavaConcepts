package oopsConceptsPart2;

public interface P14_USGovt {

	int min_bal = 100; // By defaul Static and final. cant change the value

	public void credit(); // Only method declaration required. method defination not required

	public void debit();

	public default void transfer() {
		System.out.println("US Govt - Transfer");
		//System.out.println(min_bal);
	}

	public static void NEFT() {
		System.out.println("US Govt - NEFT");
		//System.out.println(min_bal);
	}
}
