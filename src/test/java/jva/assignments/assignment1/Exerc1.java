package jva.assignments.assignment1;

import java.util.Scanner;

public class Exerc1 {
	
	// Write a program to calculate the factorial of a number using while loop

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, fact;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = scan.nextInt();
		scan.close();
		fact = 1;
		
		if(num >= 0) {
			for(int i=num;i>0;i--) {
				fact *=i;
			}
		 System.out.println("Factorial is: "+fact);
		}
		else {
			System.out.println("The number must be positive");
		}

	}

}
