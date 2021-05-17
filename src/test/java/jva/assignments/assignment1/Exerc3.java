package jva.assignments.assignment1;

public class Exerc3 {

	//Write a program to sort the elements of an array in ascending order

	public static void main(String[] args) {

		int array[] = {8,6,7,1,24,10};
		int arrayL = array.length;
		int aux;

		//bubble sort
		for (int j = 0; j < arrayL; j++) {
	   	   for (int i = j + 1; i < arrayL; i++) {
			if (array[i] < array[j]) {
				aux = array[j];
				array[j] = array[i];
				array[i] = aux;
			}
		   }
		}
		
		for(int i=0;i<arrayL;i++) {
			System.out.println(array[i]);
		}
		
	}
	
}
