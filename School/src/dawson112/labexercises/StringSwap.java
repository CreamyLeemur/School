package dawson112.labexercises;
import java.util.Scanner;

public class StringSwap {
	public static void main(String[] args) {
		
		//Gets the user's strings
		Scanner reader = new Scanner(System.in);
		String firstString = reader.nextLine();
		String secondString = reader.nextLine();
		
		//Prints them out
		System.out.println("Your first string is: \"" + firstString + "\"");
		System.out.println("Your second strin is: \"" + secondString + "\"");
		
		//Swaps the values of the strings
		String tempString = firstString;
		firstString = secondString;
		secondString = tempString;
		
		//Prints the new values of the strings
		System.out.println("The new first string is: \"" + firstString + "\"");
		System.out.println("The new second string is: \"" + secondString + "\"");

		reader.close();
	}
}
