package collectionFramework;

import java.util.ArrayList;

public class List_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> ar= new ArrayList<Object>();
		System.out.println("Size: "+ar.size()); // To get the Size
		ar.add("Rohit"); // To add value
		ar.add('A');
		ar.add(100);
		ar.add(true);
		System.out.println(ar);
		ar.remove(2);  // To remove value using index
		
		System.out.println(ar);
		System.out.println("Size: "+ar.size());
		ar.clear(); // To clear all data
		System.out.println(ar);
		System.out.println("Size: "+ar.size());
		
		ar.add(null);
		ar.add("NULL VALUE");
		ar.add(null);
		System.out.println(ar);
	}

}
