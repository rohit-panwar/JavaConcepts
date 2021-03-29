package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class List_ArrayList_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// *** Student ArrayList ***
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Rohit");
		studentList.add("Ayaansh");
		studentList.add("Krish");
		studentList.add("Mark");
		studentList.add("Jose");

		// Print using for loop
		System.out.println("-----------------------------");
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		// Print using for each loop
		System.out.println("-----------------------------");
		for (String st : studentList) {
			System.out.println(st);
		}
		// Print using iterator
		System.out.println("-----------------------------");
		Iterator<String> it = studentList.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
