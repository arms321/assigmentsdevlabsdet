package jva.assignments.assignment4;

import java.util.HashSet;
import java.util.Hashtable;

public class Exercise8 {

	//Get Set view of keys from HashTable
	public static void main(String args[]) {
	
		Hashtable<String,String> ht = new Hashtable<String, String>();
		ht.put("Leon", "First");
		ht.put("Bird", "Second");
		ht.put("Snake", "Third");
		
		System.out.println("HashTable: "+ht);
		
		HashSet<String> set = new HashSet<String>(ht.keySet());
		
		System.out.println("Keys: "+set);
			
	}
}
