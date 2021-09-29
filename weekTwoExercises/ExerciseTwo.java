package weekTwoExercises;

import java.util.Arrays;

public class ExerciseTwo {

	
	public static char[] getAlphaArray() {
		
		//since set char array to 26 and current letter to 'a' no conditional statement is needed 
		//to check if currentletter is <= z because the length of array is 26. 
		char[] alphabet = new char[26];
		char currentLetter = 'a';
		
		Boolean status = true;
		while(status == true) {
			for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = currentLetter;
			currentLetter++;
			}
			status = false;
		}
		return alphabet;
	}
	
	
	public static void main(String[]args) {
		
		char[] alpha = getAlphaArray();
		
		System.out.print(Arrays.toString(alpha));
		
	}
	
}
