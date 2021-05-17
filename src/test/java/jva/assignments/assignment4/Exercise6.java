package jva.assignments.assignment4;

import java.util.Collections;
import java.util.TreeMap;

public class Exercise6 {

	// Get highest and lowest value stored in TreeSet
	public static void main(String args[]) {

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("Leon", 5);
		tm.put("Bird", 4);
		tm.put("Elefant", 3);
		tm.put("Eagel", 4);

		System.out.println("TreeMap: " + tm);
		int max, min;
		max = Collections.max(tm.values());
		min = Collections.min(tm.values());
		System.out.println("Highest Value: " + max);
		System.out.println("Lowest Value: " + min);

	}
}
