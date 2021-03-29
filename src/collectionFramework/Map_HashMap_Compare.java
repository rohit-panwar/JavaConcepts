package collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Map_HashMap_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> h1= new HashMap<Integer, String>();
		h1.put(1, "A"); h1.put(2, "B"); h1.put(3, "C");
		
		HashMap<Integer, String> h2= new HashMap<Integer, String>();
		h2.put(1, "A"); h2.put(2, "B"); h2.put(3, "C");
		
		System.out.println("----------------- Compare : TRUE ------------------");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h1.equals(h2)); // compare key and value: True == Matched
		System.out.println(h1.keySet().equals(h2.keySet())); // compare only keys: False == Not Matched
		
		System.out.println("----------------- Compare : FALSE ------------------");
		h2.put(3, "D");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h1.equals(h2)); // compare key and value: True == Matched
		System.out.println(h1.keySet().equals(h2.keySet())); // compare only keys: False == Not Matched
		
		System.out.println("----------------- Combine/Extra/Missing Key ------------------");
		h2.put(4, "D");
		System.out.println(h1);
		System.out.println(h2);
		HashSet<Integer> keys= new HashSet<Integer>(h1.keySet());
		System.out.println("H1 Keys: "+keys); // GEt all the keys from h1
		keys.addAll(h2.keySet());
		System.out.println("H1 & H2 Keys: "+keys); // Get all the keys from h1 & h2
		keys.removeAll(h1.keySet());
		System.out.println("Missing Keys in h1: "+keys); // Get the extra key that h1 does not have
		
		System.out.println("----------------- Compare Map Value : ArrayList  ------------------");
		h2.put(3, "C");
		h2.remove(4);
		HashMap<Integer, String> h3= new HashMap<Integer, String>();
		h3.put(1, "A"); h3.put(2, "B"); h3.put(3, "C"); h3.put(4, "C");
		
		System.out.println("Map1: "+h1);
		System.out.println("Map2: "+h2);
		System.out.println("Map3: "+h3);
		System.out.println(new ArrayList<String>(h1.values()).equals(new ArrayList<String>(h2.values()))); // Matched: TRUE
		System.out.println(new ArrayList<String>(h1.values()).equals(new ArrayList<String>(h3.values()))); //Not Matched: FALSE
		
		System.out.println("----------------- Compare Map Value : HashSet  ------------------");
				
		System.out.println("Map1: "+h1);
		System.out.println("Map2: "+h2);
		System.out.println("Map3: "+h3);
		System.out.println(new HashSet<String>(h1.values()).equals(new HashSet<String>(h2.values()))); // Matched: TRUE
		System.out.println(new HashSet<String>(h1.values()).equals(new HashSet<String>(h3.values()))); // Matched: TRUE
	}

}
