package jva.assignments.assignment4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise7 {

	// Sort ArrayList of Strings alphabetically
	public static void main(String args[]) {

		List<String> lst = new ArrayList<String>();
		lst.add("Roberto");
		lst.add("Andra");
		lst.add("Margarita");
		lst.add("Katherine");

		System.out.println("List: " + lst);

		lst.sort(Comparator.naturalOrder());

		System.out.println("Sorted list: " + lst);

	}
}
