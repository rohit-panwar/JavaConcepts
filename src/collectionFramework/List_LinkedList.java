package collectionFramework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class List_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> name= new LinkedList<String>();
		
		name.add("Rohit");
		name.add("Ayaansh");
		name.add("Krrish");
		System.out.println(name);
		
		name.addFirst("ABC");
		name.addLast("XYZ");
		System.out.println(name);
		
		name.add(0, "FIRST");
		System.out.println(name);
		
		name.add(3, "Payal");
		System.out.println(name);
		
		name.remove();
		System.out.println(name); // First element will be removed
		name.add(5, "Test");
		System.out.println(name);
		name.remove(5);
		System.out.println(name); 
		
		System.out.println("************* Sorted *****************");
		Collections.sort(name);
		System.out.println(name); // Will sort the List
		
		System.out.println("************* Print using Iterator *****************");
		Iterator<String> it= name.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("************* Reverse Sorted *****************");
		Iterator<String> dit=name.descendingIterator();
		while(dit.hasNext())
			System.out.println(dit.next());
	}

}
