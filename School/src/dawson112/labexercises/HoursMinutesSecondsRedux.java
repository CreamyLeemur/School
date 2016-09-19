package dawson112.labexercises;
import java.util.Scanner;

public class HoursMinutesSecondsRedux {
	public static void main(String[] args) {
		
		//Gets the input
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter seconds: ");
		int seconds = reader.nextInt();
		
		//Prints the first line
		System.out.println(seconds + " seconds is equal to:");
		
		//Calculates the amount of minutes and hours
		int hours = seconds / 3600;
		int minutes = (seconds % 3600) / 60;
		seconds = ((seconds % 3600) % 3600) % 60;
		
		//Prints the rest of the lines
		System.out.println(hours + " hours,");
		System.out.println(minutes + " minutes and");
		System.out.println(seconds + " seconds.");
		
		//Closes the scanner
		reader.close();
	}
}