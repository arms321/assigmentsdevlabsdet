package jva.assignments.assignment1;

public class Exerc5 {

	// Write a program to print first 10 prime numbers.

	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {
			  boolean flag = primeNumber(i);
			   if(flag)
			       System.out.println(i);
		}

	}
	
	public static boolean primeNumber(int num) {
	    	boolean flag = false;
	         for(int i=2;i<=num/2;i++)
	         {
	             if(num%i == 0)
	             { 
	                 flag = true;
	             }
	         }
	       
	    	return !flag;
	    }
	
}
