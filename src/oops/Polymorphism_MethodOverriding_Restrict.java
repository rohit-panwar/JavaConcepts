package oops;

public class Polymorphism_MethodOverriding_Restrict {

	// It can be achieved in 3 ways
	// Making Base class method as Private
	// Making Base class method as Static
	// Making Base class method as Final
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI r= new RBI();
		r.homeLoan();
		//r.repoRate(); // Cannot call this method as it is private
		RBI.fdRate();
		r.reverseRepoRate();
		
		SBI s= new SBI();
		s.homeLoan();
		s.repoRate();
		SBI.fdRate();
	}
}

class RBI{
	void homeLoan() {
		System.out.println("RBI: Home Loan");
	}
	
	private void repoRate() { // Private method can not be Overridden
		System.out.println("RBI: RepoRate");
	}
	
	static void fdRate() { // static method can not be interitated
		System.out.println("RBI: FD Rate");
	}
	
	final void reverseRepoRate() { // final method can not be interitated
		System.out.println("RBI: Reverse RepoRate");
	}
}

class SBI extends RBI{
		
	void homeLoan() {
		System.out.println("SBI: Home Loan");
	}
	
	void repoRate() { // Private method can not be Overridden
		System.out.println("SBI: RepoRate");
	}
	
	/*
	 * public void fdRate() { // static method can not be interitated
	 * System.out.println("RBI: FD Rate"); }
	 * 
	 * public void reverseRepoRate() { // final method can not be interitated
	 * System.out.println("RBI: Reverse RepoRate"); }
	 */
}