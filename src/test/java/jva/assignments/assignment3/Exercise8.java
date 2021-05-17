package jva.assignments.assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise8 {

	// Write a program to re-throw an exception. ( throw inside catch block)

	public static void main(String[] args) {

		try {
			int num1;
			try {

				Scanner scan = new Scanner(System.in);
				System.out.println("Number: ");
				num1 = scan.nextInt();
				scan.close();

			} catch (Exception e) {
				throw new InputMismatchException("Enter a number");
			}
			System.out.println("Entered number is: " + num1);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}

}
