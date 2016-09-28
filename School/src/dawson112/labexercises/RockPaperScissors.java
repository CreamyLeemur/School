package dawson112.labexercises;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		
		//Creates a scanner
		Scanner reader = new Scanner(System.in);
		
		//Gets the first player's input and converts it to lower case
		System.out.println("Player one, enter your input");
		String firstPlayerInput = reader.nextLine().toLowerCase();
		
		//Gets the second player's input and converts it to lower case
		System.out.println("Player two, enter your input");
		String secondPlayerInput = reader.nextLine().toLowerCase();
		
		//Declares the string for the winner
		String winner = "";
		
		//Compares the inputs
		if (firstPlayerInput.equals("rock")) {
			if (secondPlayerInput.equals("rock")) {
				winner = "It's a tie! No one";
			} else if (secondPlayerInput.equals("paper")) {
				winner = "Player two";
			} else if (secondPlayerInput.equals("scissors")) {
				winner = "Player one";
			} else {
				winner = "No one";
				System.out.println("Incorrect input");
			}
		} else if (firstPlayerInput.equals("paper")) {
			if (secondPlayerInput.equals("rock")) {
				winner = "Player one";
			} else if (secondPlayerInput.equals("paper")) {
				winner = "It's a tie! No one";
			} else if (secondPlayerInput.equals("scissors")) {
				winner = "Player two";
			} else {
				winner = "No one";
				System.out.println("Incorrect input");
			}
		} else if (firstPlayerInput.equals("scissors")) {
			if (secondPlayerInput.equals("rock")) {
				winner = "Player two";
			} else if (secondPlayerInput.equals("paper")) {
				winner = "Player one";
			} else if (secondPlayerInput.equals("scissors")) {
				winner = "It's a tie! No one";
			} else {
				winner = "No one";
				System.out.println("Incorrect input");
			}
		} else {
			winner = "No one";
			System.out.println("Incorrect input");
		}
		
		//Prints the winner
		System.out.println(winner + " wins!");
		
		//Closes the scanner
		reader.close();
		
	}
}
