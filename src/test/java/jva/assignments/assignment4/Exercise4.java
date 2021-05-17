package jva.assignments.assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exercise4 {

	// Convert keys of a map to a list.
	public static void main(String args[]) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Leon", 5);
		hm.put("Bird", 4);
		hm.put("Elefant", 3);
		hm.put("Eagel", 4);

		List<String> lst = new ArrayList<String>(hm.keySet());
		System.out.println("List of keys: " + lst);

	}
}
