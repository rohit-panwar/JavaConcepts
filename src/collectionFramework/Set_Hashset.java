package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> name = new HashSet<String>();
		name.add("Rohit");
		name.add("Ayaansh");
		name.add("Krrish");
		name.add(null); // Only one null it will add. Duplicate will be ignored
		name.add(null);
		name.add("Harry"); // Duplicate values will be ignored
		name.add("Harry");
		name.add("Donald");

		System.out.println(name);

		System.out.println(name.contains("Rohit")); // TRUE
		System.out.println(name.contains("Kite")); // FALSE

		name.remove("Harry");
		System.out.println(name);

		System.out.println("=============== For Each ==============");
		for (String s : name) {
			System.out.println(s);
		}

		System.out.println("=============== Iterator ==============");
		Iterator<String> it = name.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		System.out.println("=============== Sort using ArrayList==============");
		ArrayList<String> arrayList= new ArrayList<String>();
		arrayList.addAll(name);
		System.out.println(arrayList);
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}

}
