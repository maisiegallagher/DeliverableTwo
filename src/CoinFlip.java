import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {

		// declare and initialize the 3 variables
		String headsOrTailsGuess;
		int numberOfFlips = 0;
		int correctCount = 0;

		// need Scanner for user to input response
		Scanner scnr = new Scanner(System.in);

		// user guesses heads or tails
		System.out.println("Guess which will have more: heads or tails?");
		headsOrTailsGuess = scnr.nextLine();

		// user inputs how many times to flip
		System.out.println("How many times shall we flip a coin?");
		numberOfFlips = scnr.nextInt();

		// less than 0.5 equals heads using Math.random
		for (int i = 0; i < numberOfFlips; i++) {
			if (Math.random() < 0.5) {
				if (headsOrTailsGuess.contentEquals("heads")) {
					correctCount++;
				}
				// output the result heads
				System.out.println("heads");
			} else {
				// greater than or equal to 0.5 is tails
				if (headsOrTailsGuess.contentEquals("tails")) {
					correctCount++;
				}
				// output the result tails
				System.out.println("tails");
			}
		}

		// output results to the user
		System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + correctCount + " time(s).");
		int percent = (correctCount * 100) / numberOfFlips;
		System.out.println("That's " + percent + "%.");

		// close scanner
		scnr.close();
	}
}
