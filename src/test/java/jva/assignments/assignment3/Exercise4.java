package jva.assignments.assignment3;


public class Exercise4 {

	// Write a program to convert String to a character array and character array to String

	public static void main(String[] args) {
		
		String str = "ramdon string for exercise";
		System.out.println("Actual string: "+str);
		
		char[] charArray = str.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			System.out.print(charArray[i]);
			if(charArray[i] == 'e')
				charArray[i] = 'y';
		}
		
		String str2 = new String(charArray);
		System.out.println("Char array: "+str2);


	}
	
}
