package dawson112.labexercises;
import java.util.Scanner;

public class Quadrants {
	public static void main(String[] args) {
		
		//Creates a scanner
		Scanner reader = new Scanner(System.in);
		
		//Gets user input
		System.out.println("Enter x coordinate");
		double xCoord = reader.nextDouble();
		System.out.println("Enter y coordinate");
		double yCoord = reader.nextDouble();
		
		//Checks in what quadrant the point is located
		if (xCoord > 0 && yCoord > 0) {
			System.out.println("The point is in the first quadrant");
		} else if (xCoord < 0 && yCoord > 0) {
			System.out.println("The point is in the second quadrant");
		} else if (xCoord < 0 && yCoord < 0) {
			System.out.println("The point is in the third quadrant");
		} else {
			System.out.println("The point is in the fourth quadrant");
		}
		
		//Closes the scanner
		reader.close();
	}
}
