package jva.assignments.assignment1;

public class Exerc9 {

	// Write a program to print only even numbers till 50

	public static void main(String[] args) {

		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0)
				System.out.println(String.format("Number %d is even", i));
			else
				System.out.println(String.format("Number %d is odd", i));
		}

	}

}
