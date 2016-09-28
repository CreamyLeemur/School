package dawson112.labexercises;
import java.util.Scanner;

public class RockPaperScissorsYouLose {
	public static void main(String[] args) {
		//Creates a scanner
		Scanner reader = new Scanner(System.in);
				
		//Gets the first player's input and converts it to lower case
		System.out.println("Player one, enter your input");
		String playerInput = reader.nextLine().toLowerCase();
		
		//Declares the computer's input
		String computerInput = "";
		
		//Makes it so that the computer wins
		if (playerInput.equals("rock")) {
			computerInput = "paper";
			System.out.println("I choose paper!");
			System.out.println("I always win! Hahahahah!");
		} else if (playerInput.equals("paper")) {
			computerInput = "scissors";
			System.out.println("I choose scissors!");
			System.out.println("I always win! Hahahahah!");
		} else if (playerInput.equals("scissors")) {
			computerInput = "rock";
			System.out.println("I choose rock!");
			System.out.println("I always win! Hahahahah!");
		} else {
			System.out.println("Incorrect input");
			System.out.println("But I still win! Hahahahah!");
		}
		
		//Closes the scanner
		reader.close();
	}
}
