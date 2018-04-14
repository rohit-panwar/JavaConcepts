package javaBasics;

public class Part2IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=100; int j=200; int k=300;
		
		if(i>j)
			System.out.println("i is greater than j: "+i+"<"+j);
		else 
			System.out.println("j is greater than i: "+j+ ">" +i );
	
	
	if (i>j & i>k)
		System.out.println("i is the greatest number: "+i);
	else if (j>k)
		System.out.println("j is the greatest number: "+j);
	else 
		System.out.println("k is the greatest number: "+k);
	}
}

