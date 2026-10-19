import java.util.Scanner;

public class Vigenere {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub

		//Read in message
		System.out.println("Enter Meessage: ");
;		String message = input.nextLine().toUpperCase();
		//Read in shift word
		System.out.println("Enter shift word: ");
		String shiftWord = input.nextLine().toUpperCase();
		
		String output = "";
		int shiftIndex = 0;
		
		//Loop through message
		for (int i =0; i< message.length(); i++) {
			char letter = message.charAt(i);
		
			//if letter is alphabetic
			if (letter >= 'A' && letter <= 'Z') {
				//apply shift from the current letter
				int shift = shiftWord.charAt(shiftIndex)- 'A';
				letter = (char) (letter + shift);
				//move to the next shift letter, loop back to the beginning if necessary
				//if letter is past 'Z'
				if (letter > 'Z') {
					//subtract 26
					letter = (char)(letter - 26);
				}
					//move to the next shift letter
				shiftIndex++;
				//Loop back to beginning if necessary
				if (shiftIndex==shiftWord.length()) {
					shiftIndex = 0;
				}
			}
			//add letter to output
		output+= letter;
		//print output
		}
		System.out.println("outputK "+ output);
		
	}

}
