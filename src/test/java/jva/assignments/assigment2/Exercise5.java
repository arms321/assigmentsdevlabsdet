package jva.assignments.assigment2;

public class Exercise5 {

	// Reverse a number 123

	public static void main(String[] args) {

		int number = 123;
		char[] array = String.valueOf(number).toCharArray();
		String rNum = "";

		for (int i = array.length - 1; i >= 0; i--) {
			rNum += array[i];
		}

		System.out.println("Reverse number is: " + rNum);

	}

}
