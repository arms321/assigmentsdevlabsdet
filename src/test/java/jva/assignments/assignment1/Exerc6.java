package jva.assignments.assignment1;

import java.util.Scanner;

public class Exerc6 {

	// Write a program to calculate area of triangle. User will enter the values for
	// base and height of the triangle.

	public static void main(String[] args) {

		double base, height;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter Base:");
		base = scan.nextDouble();
		System.out.println("Please enter Height:");
		height = scan.nextDouble();
		scan.close();

		double res = (base * height) / 2;
		System.out.println("Area: " + res);

	}

}
