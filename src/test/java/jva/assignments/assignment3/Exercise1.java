package jva.assignments.assignment3;


public class Exercise1 {

	// Write a program to print the occurrence of each character in the String - DevLabsAlliance Training

	public static void main(String[] args) {

		String str = "DevLabs Alliance Training";
		
		for(int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			int count = getOccurrences(c, str);
			System.out.println("Ocurrences of char "+(c)+" : "+count);
		}

	}
	
	public static int getOccurrences(char c, String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if (c==s.charAt(i))
				count++;
		}
		return count;
	}
}
