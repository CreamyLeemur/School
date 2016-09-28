package dawson112.labexercises;
import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		
		//Creates the scanner
		Scanner reader = new Scanner(System.in);
		
		//Gets user input
		System.out.println("Enter a");
		double a = reader.nextDouble();
		
		System.out.println("Enter b");
		double b = reader.nextDouble();
		
		System.out.println("Enter c");
		double c = reader.nextDouble();
		
		//Calculates the discriminant
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		
		//Checks if the discriminant is positive, zero, or negative
		if (discriminant > 0) {
			//Calculate the roots
			double firstRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
			double secondRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
			
			//Print the two roots
			System.out.println("First root: " + firstRoot);
			System.out.println("Second root: " + secondRoot);
		} else if (discriminant == 0) {
			//Calculate the root
			double firstRoot = -b / (2 * a);
			
			//Print the root
			System.out.println("Root: " + firstRoot);
		} else {
			//Print that there are no roots
			System.out.println("Discriminant is negative, no real roots");
		}
	}
}
