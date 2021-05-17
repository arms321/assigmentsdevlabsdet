package jva.assignments.assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise7 {

	//Write a program with nested try blocks.

	public static void main(String[] args) {

		try {
			int num1, num2;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first number: ");
			num1 = scan.nextInt();
			System.out.println("Enter second number: ");
			num2 = scan.nextInt();
			scan.close();
			try {
				int res;
				res = num1/num2;
				System.out.println("Result is: "+res);
				
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
	}
	
}
