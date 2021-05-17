package jva.assignments.assignment4;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Exercise1 {

	//Find duplicate characters with their occurrences count using HashMap
	public static void main(String args[]) {
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		hm.put("Leon", 5);
		hm.put("Bird", 4);
		hm.put("Elefant", 3);
		hm.put("Eagel", 4);
		
		System.out.println(hm);
		
		HashSet<Integer> set = new HashSet<Integer>(hm.values());
		
		if(hm.size() == set.size()) {
			System.out.println("No duplicate found");
		}else {
		        for (Integer s: set) {
		            System.out.println(s + ": " + Collections.frequency(hm.values(), s));
		        }
		}
		
	}

}
