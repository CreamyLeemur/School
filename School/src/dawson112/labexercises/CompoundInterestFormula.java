package dawson112.labexercises;
import java.util.Scanner;

public class CompoundInterestFormula {
	public static void main(String[] args) {
		
		//Gets the user input
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter starting account balance:");
		double startingBalance = reader.nextDouble();
		System.out.println("Enter number of years:");
		int numberOfYears = reader.nextInt();
		
		//Value of the interest rate = 7.5%
		final double INTEREST_RATE = 0.075;
		
		//Calculates the final balance
		double finalBalance = startingBalance * Math.pow((1 + INTEREST_RATE), numberOfYears);
		
		//Rounds the answer
		finalBalance = (finalBalance / 100) * 100;
		
		//Displays the result and closes the scanner
		System.out.println("The final balance in " + numberOfYears + " years will be: " + finalBalance);
		reader.close();
	}
}
