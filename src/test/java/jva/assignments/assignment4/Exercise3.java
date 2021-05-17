package jva.assignments.assignment4;

import java.util.Hashtable;

public class Exercise3 {

	//Check a particular key exists in HashTable.
	public static void main(String args[]) {
		Hashtable<String,String> hm = new Hashtable<String, String>();
		hm.put("Leon", "First");
		hm.put("Bird", "Second");
		hm.put("Snake", "Third");
		
		if(hm.containsKey("Bird"))
			System.out.println("The Key is present");
		else
			System.out.println("The key is not present");
		
	}
}
