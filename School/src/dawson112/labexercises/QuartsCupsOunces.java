package dawson112.labexercises;
import java.util.Scanner;

public class QuartsCupsOunces {
	public static void main(String[] args) {
		
		//Gets user input
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number of ounces:");
		int ounces = reader.nextInt();
		
		//Prints the first line
		System.out.println(ounces + " ounces is equivalent to:");
		
		//Calculates the amounts
		int quarts = ounces / 32;
		int cups = (ounces % 32) / 8;
		ounces = (ounces % 32) % 8;
		
		//Prints out the other lines and closes the reader
		System.out.println();
		System.out.println(quarts + " quarts,");
		System.out.println(cups + " cups, and");
		System.out.println(ounces + " ounces.");
		reader.close();		
	}
}
