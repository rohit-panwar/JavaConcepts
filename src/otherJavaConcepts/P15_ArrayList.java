package otherJavaConcepts;

import java.util.ArrayList;

public class P15_ArrayList {

	public static void main(String[] args) {
		
		System.out.println("*** Array List ***");
		ArrayList a= new ArrayList();
		a.add(100);
		a.add(11.111);
		a.add(true);
		a.add('M');
		a.add("Hello");
		
		for (int i=0; i<a.size();i++)
			System.out.println(a.get(i));
		
		System.out.println("*** Array List: Integer ***");
		ArrayList<Integer> ai=new ArrayList<Integer>();
		ai.add(10);
		ai.add(20);
		ai.add(30);
		System.out.println(ai.size());
		for (int i=0; i<ai.size();i++)
			System.out.println(ai.get(i));
		ai.remove(1);
		System.out.println("****Deleted Index******"+ai.get(1));
		System.out.println(ai.size());
		for (int i=0; i<ai.size();i++)
			System.out.println(ai.get(i));
	}

}
