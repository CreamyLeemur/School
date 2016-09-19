package dawson112.labexercises;
import java.util.Scanner;

public class BeamLength {
	public static void main(String[] args) {
		
		//Creates a scanner named reader for user input
		Scanner reader = new Scanner(System.in);
		
		//Gets the user's input and stores it as doubles
		System.out.println("Enter distance from the beam:");
		double distance = reader.nextDouble();
		
		System.out.println("Enter pole height:");
		double poleHeight = reader.nextDouble();
		
		//Does the calculation
		double beamLength = Math.sqrt((Math.pow(distance, 2) + Math.pow(poleHeight, 2)));
		
		//Prints the result
		System.out.println("The lenght of the beam should be " + beamLength + " meters");
		
		//Closes the reader
		reader.close();
	}
}