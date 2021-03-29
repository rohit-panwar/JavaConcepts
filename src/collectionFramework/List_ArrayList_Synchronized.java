package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class List_ArrayList_Synchronized {

	public static void main(String[] args) {
		// 1. Using Collections.synchronizedList
		List<String> Studuet = Collections.synchronizedList(new ArrayList<String>());
		Studuet.add("Rohit");
		Studuet.add("Ayaansh");
		Studuet.add("Krrish");
		Studuet.add("Java");
		Studuet.remove(3);

		synchronized (Studuet) {

			Iterator<String> it = Studuet.iterator();
			while (it.hasNext())
				System.out.println(it.next());
		}
		System.out.println("==========================");
		// 2. Using CopyOnWriteArrayList
		
		CopyOnWriteArrayList<String> emp= new CopyOnWriteArrayList<String>();
		emp.add("Rohit");
		emp.add("Ayaansh");
		emp.add("Krrish");
		emp.add("Java");
		emp.remove(3);
		
		Iterator<String> it_emp=emp.iterator();
		while(it_emp.hasNext())
			System.out.println(it_emp.next());
	}

}
