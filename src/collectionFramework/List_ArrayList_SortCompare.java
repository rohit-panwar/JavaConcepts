package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List_ArrayList_SortCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> l1= new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> l2= new ArrayList<String>(Arrays.asList("D", "C", "A", "E", "B"));
		
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println("Before sorting: Is l1 equals to l2: "+l1.equals(l2));
		Collections.sort(l2);
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println("After sorting: Is l1 equals to l2: "+l1.equals(l2));
		
		ArrayList<String> l3= new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
		ArrayList<String> l4= new ArrayList<String>(Arrays.asList("G", "A", "B", "C", "D", "E"));
		l3.removeAll(l4);
		System.out.println("Extra element in L3: "+l3);
		
		ArrayList<String> l5= new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
		ArrayList<String> l6= new ArrayList<String>(Arrays.asList("G", "A", "B", "C", "D", "E"));
		l6.removeAll(l5);
		System.out.println("Additional element in L6: "+l6);
		
		ArrayList<String> l7= new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
		ArrayList<String> l8= new ArrayList<String>(Arrays.asList("G", "A", "B", "C", "D", "E"));
		l7.retainAll(l8);
		System.out.println("Common element in both lidt: "+l7);
	}

}
