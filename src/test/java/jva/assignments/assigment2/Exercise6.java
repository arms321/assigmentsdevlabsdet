package jva.assignments.assigment2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Exercise6 {

	// Find the duplicates in an array 12, 32, 12, 45, 65, 93, 0, 23, 45, 6

	public static void main(String[] args) {

		Integer[] array = { 12, 32, 12, 45, 65, 93, 0, 23, 45, 6 };

		System.out.println("Array : " + Arrays.asList(array));

		HashSet<Integer> hSet = new HashSet<Integer>(Arrays.asList(array));

		if (array.length == hSet.size()) {
			System.out.println("No duplicate values in the array");
		} else {
			for (Integer a : hSet) {
				System.out.println(a + ": " + Collections.frequency(Arrays.asList(array), a));
			}
		}

	}

}
