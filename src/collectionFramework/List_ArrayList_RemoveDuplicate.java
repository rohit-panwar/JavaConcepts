package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class List_ArrayList_RemoveDuplicate {

	public static void main(String[] args) {
		// 1. Using set
		ArrayList<Integer> numberList= new ArrayList<Integer>(Arrays.asList(10,34,3,6,7,3,5,6,7,3,4,6,3,3,5,7,4,3,6,7,5,7,9));
		System.out.println(numberList); // Array list all items

		LinkedHashSet<Integer> numberSet= new LinkedHashSet<Integer>(numberList);
		System.out.println(numberSet); // Set having non duplicate values
		
		ArrayList<Integer> numberListNonDuplicate= new ArrayList<Integer>(numberSet);
		System.out.println(numberListNonDuplicate); // ArrayList having non duplicate values
	}

}
