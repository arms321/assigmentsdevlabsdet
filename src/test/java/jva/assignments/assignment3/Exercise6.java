package jva.assignments.assignment3;

import java.util.Scanner;

public class Exercise6 {

	// Write a program where a method declares that it throws ArithmeticException.

	static void isValid(int num) throws ArithmeticException {
		if (num >= 1 && num <= 50) {
			System.out.println("Valid number");
		} else {
			throw new ArithmeticException("ArithmeticException");
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 50: ");
		int num = scan.nextInt();
		scan.close();
		try {
			isValid(num);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
