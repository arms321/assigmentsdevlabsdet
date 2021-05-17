package jva.assignments.assigment2;

public class Exercise3 {

	// Is 13 a prime number?

	public static void main(String[] args) {

		boolean flag = isPrimeNumber(13);
		if (flag)
			System.out.println("13 is prime");
		else
			System.out.println("13 is not prime");

	}

	public static boolean isPrimeNumber(int num) {
		boolean flag = false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
			}
		}

		return !flag;
	}

}
