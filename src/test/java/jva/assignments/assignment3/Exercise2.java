package jva.assignments.assignment3;

import java.util.Scanner;

public class Exercise2 {

	// Write a program to check if a given string is a palindrome or not. Palindrome
	// example : trurt

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String str = scan.next();
		scan.close();
		StringBuffer strB = new StringBuffer(str);
		strB.reverse();

		System.out.println("Entered word: " + str);
		System.out.println("Entered word reversed: " + strB.toString());

		if (str.equalsIgnoreCase(strB.toString()))
			System.out.println("Entered word is palindrome :)");
		else
			System.out.println("Entered word is not palindrome :(");

	}

}
