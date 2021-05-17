package jva.assignments.assignment4;

import java.util.Arrays;
import java.util.HashSet;

public class Exercise5 {

	// Copy all elements of a HashSet to an Object array.
	public static void main(String args[]) {

		HashSet<String> hm = new HashSet<String>();
		hm.add("Leon");
		hm.add("Bird");
		hm.add("Elefant");
		hm.add("Eagel");

		Object[] arry = hm.toArray();

		System.out.println("Array: " + Arrays.asList(arry));

	}
}
