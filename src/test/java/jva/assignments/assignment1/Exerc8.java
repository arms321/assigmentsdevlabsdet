package jva.assignments.assignment1;

import java.util.Scanner;

public class Exerc8 {

	// Write a program to reverse the elements of an array where the array size as
	// well as the array values are entered by the user.

	public static void main(String[] args) {

		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		num = scan.nextInt();

		String strArray[] = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter something:");
			strArray[i] = scan.next();
		}
		scan.close();
		System.out.println("-----------");
		strArray = gatReverseArray(strArray, num);
		for (int i = 0; i < num; i++) {
			System.out.println(strArray[i]);
		}

	}

	public static String[] gatReverseArray(String[] oArray, int size) {
		String tempArray[] = new String[size];
		int j = 0;
		for (int i = size - 1; i >= 0; i--) {
			tempArray[j++] = oArray[i];
		}
		return tempArray;

	}

}
