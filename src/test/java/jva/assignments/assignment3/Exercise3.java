package jva.assignments.assignment3;

public class Exercise3 {

	// Write a program to check “brown” is present in the string : A brown fox ran
	// away fast

	public static void main(String[] args) {

		String str = "A brown fox ran away fast";

		if (str.contains("brown"))
			System.out.println("Contains brown");
		else
			System.out.println("Not contains brown");

	}

}
