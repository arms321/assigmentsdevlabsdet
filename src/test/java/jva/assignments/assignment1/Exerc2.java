package jva.assignments.assignment1;

public class Exerc2 {
	// Write a program to print Fibonacci series (10 values)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int res;
		
		System.out.print("0,1");
		
		for(int i=1;i<=8;i++) {
			res = a+b;
			System.out.print(","+res);
			a=b;
			b=res;
		}
	}

}
