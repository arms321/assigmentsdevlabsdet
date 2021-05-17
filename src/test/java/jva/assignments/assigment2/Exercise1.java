package jva.assignments.assigment2;

public class Exercise1 {

	// Program to Calculate average of numbers using Array

	public static void main(String[] args) {

		int[] arry = { 1, 2, 3, 4, 5 };
		int sum = 0;

		for (int i = 0; i < arry.length; i++) {
			sum += arry[i];
		}

		int average = sum / arry.length;
		System.out.println("Average: " + average);

	}

}
