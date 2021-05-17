package jva.assignments.assignment1;

import java.util.Scanner;

public class Exerc4 {

	// Write a program to check current year is leap year or not. User will enter
	// year value

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year value:");
		int yearValue = scan.nextInt();
		scan.close();

		if (isLeapYear(yearValue))
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");

	}

	public static boolean isLeapYear(int yr) {
		boolean leapYear = false;

		if (yr % 4 == 0) {
			if (yr % 100 == 0) {
				if (yr % 400 == 0)
					leapYear = true;
				else
					leapYear = false;
			} else
				leapYear = true;
		} else {
			leapYear = false;
		}

		return leapYear;
	}

}
