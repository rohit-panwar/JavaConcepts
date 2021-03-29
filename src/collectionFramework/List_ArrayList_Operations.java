package collectionFramework;

import java.util.ArrayList;

public class List_ArrayList_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arr1= new ArrayList<String>();
		arr1.add("Java");
		arr1.add(".net");
		arr1.add("php");
		arr1.add("COBOL");
		
		ArrayList<String> arr2= new ArrayList<String>();
		arr2.add("Python");
		arr2.add("Rail");
		arr2.add("php");
		
		System.out.println("Array List 1: "+arr1);
		System.out.println("Array List 2: "+arr2);
		arr1.addAll(arr2); // To add the 2nd list after 1st list
		//arr1.addAll(2, arr2); // To add 2nd list from specific index
		System.out.println("Array List 1: "+arr1);
		System.out.println("Last index of php: "+arr1.lastIndexOf("php"));
		System.out.println("Last index of test: "+arr1.lastIndexOf("test")); // Return index -1 if not found
		
		@SuppressWarnings("unchecked")
		ArrayList<String> cloneArr2= (ArrayList<String>)arr2.clone();
		System.out.println("Array List Clone 2: "+cloneArr2);
		
		System.out.println(arr1.contains("php"));
		System.out.println(arr1.contains("ruby"));
		System.out.println("Index of COBOL: "+arr1.indexOf("COBOL"));
		
	}

}
