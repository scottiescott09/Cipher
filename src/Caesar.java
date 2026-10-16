import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// Read in message
		System.out.println("Enter a message: ");
		String message = in.nextLine();
		// Read in shift
		System.out.println("Enter a shift: ");
		int shift = in.nextInt();

		String output = "";
		// Loop through message
		for (int i = 0; i < message.length(); i++) {

			char letter = message.charAt(i);

			// if letter is alphabetic
			if (letter >= 'a' && letter <= 'z') {
				// apply shift
				letter += shift;
			}
			// if letter is past 'Z'
			if (letter > 'z') {
				// subtract 26
				letter -= 26;
			}

			// add letter to output
			output += letter;
			// print output
		}
			System.out.println("Output: " + output);
	}
}