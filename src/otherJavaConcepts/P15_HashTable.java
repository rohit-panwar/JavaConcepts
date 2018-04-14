package otherJavaConcepts;

import java.util.Hashtable;

public class P15_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Hashtable: Basic ***");
		Hashtable h= new Hashtable();	
		h.put(1, 100);
		h.put('A', 'H');
		h.put(11.12, 125.125);
		h.put("Subject", "Selenium");
		
		System.out.println("Integer: "+h.get(1)+", Char: "+h.get('A')+", Double: "+h.get(11.12)+", String: "+h.get("Subject")+", NO_Key: "+h.get(10));
		
		System.out.println();
		System.out.println("*** Hashtable: Integer");
		Hashtable<Integer, Integer> hi= new Hashtable<Integer, Integer>();
		hi.put(1, 100);
		hi.put(2, 200);
		hi.put(3, 300);
		//hi.put("RP", "Roh");
		System.out.println("Integer: "+hi.get(1)+", Integer: "+hi.get(2)+", Integer: "+hi.get(3)+", String: "+h.get("RP"));
		hi.remove(3);
		System.out.println("Integer: "+hi.get(1)+", Integer: "+hi.get(2)+", Integer: "+hi.get(3)+", String: "+h.get("RP"));
	}

}
