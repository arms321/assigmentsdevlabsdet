package jva.assignments.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise2 {

	//Reverse an ArrayList.
	public static void main(String args[]) {
		
		List<String> lst = new ArrayList<String>();
		lst.add("Leon");
		lst.add("Bird");
		lst.add("Snake");
		
		System.out.println("List: "+lst);
		
		Collections.reverse(lst);

		System.out.println("Reversed list: "+lst);

	}
}
