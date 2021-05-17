package jva.assignments.assignment3;

import java.util.Scanner;

public class Exercise5 {

	// Write a program to throw NumberFormatException and handle it appropriately
	// with prop message.
	// If you pass invalid input to parseInt(str), this exception will be thrown.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		String num = scan.next();
		Integer intNum;
		scan.close();

		try {
			// Parsing string into Integer
			intNum = Integer.parseInt(num);
			System.out.println("Parsed number is: " + intNum);

		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("You entered an invalid number");
		}
	}

}
