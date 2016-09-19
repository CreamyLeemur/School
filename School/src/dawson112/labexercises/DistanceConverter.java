package dawson112.labexercises;
import java.util.Scanner;

public class DistanceConverter {
	public static void main(String[] args) {
		
		//Creates a scanner named reader for user input
		Scanner reader = new Scanner(System.in);
		
		//Gets the user's input and stores it in the double distMiles
		System.out.println("Enter distance in miles:");
		double distMiles = reader.nextDouble();

		//Converts miles to kilometers
		double distKilometers = distMiles * 1.609;
		
		//Prints the result
		System.out.println(distMiles + " miles is equal to " + distKilometers + " kilometers");
		
		//Closes the scanner
		reader.close();
	}
}
