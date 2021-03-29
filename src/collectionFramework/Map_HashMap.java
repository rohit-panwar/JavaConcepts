package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Map_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> capital= new HashMap<String, String>();
		capital.put("India", "New Delhi");
		capital.put("UK", "London");
		capital.put("Japan", "Tokyo");
		capital.put("France", "Peris");
		capital.put("Israel", "Tel Aviv");
		
		System.out.println("Capital of UK is: "+capital.get("UK"));
		
		System.out.println(capital); // To print all map Key and Value
		
		capital.put("France", "New Peris"); // Duplicate keys are not allowed. it will override the existing value by new value.
		System.out.println(capital); 
		
		capital.put("Wakanda", null); // Hashmap allow to store N number of null values
		capital.put("Gautam", null);
		System.out.println(capital); 
		
		System.out.println("-------------------null key---------------------------");
		capital.put(null, "A"); // Hashmap allow only 1 null key. 
		System.out.println(capital); 
		capital.put(null, "B");
		System.out.println(capital); 
		capital.put(null, null);
		System.out.println(capital);
		
		System.out.println("------------------ITERATOR:ENTRYSET---------------------------");
		// To print all the keys and value using Iterator: KeySet
		Iterator<String> it=capital.keySet().iterator();
		while(it.hasNext()) {
			String capitalKey=it.next();
			System.out.println("Key: "+capitalKey+" == Value: "+capital.get(capitalKey));
		}
		
		System.out.println("------------------ITERATOR:ENTRYSET---------------------");
		// To print all the keys and value using Iterator: EntrySet
		Iterator<Entry<String,String>> it1=capital.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, String> caps=it1.next();
			System.out.println(caps.getKey()+":"+caps.getValue());
		}
		
		System.out.println("-------------------JAVA 8 / LAMBDA ---------------------");
		// To print all the keys and value using Java 8 for each and lambda
		capital.forEach((k,v) -> System.out.println("Key="+k+" : Value="+v));
	}

}
