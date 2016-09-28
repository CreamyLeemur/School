package dawson112.assignments;
import java.util.Scanner;

public class LoanCalculator {
	public static void main(String args[]) {
		
		//Initializes the scanner
		Scanner reader = new Scanner(System.in);
		
		//Asks the user for input and saves those values as doubles
		System.out.println("Enter principle");
		double principle = reader.nextDouble();
		
		System.out.println("Enter annual interest rate (in percent)");
		double interestRate = reader.nextDouble();
		
		System.out.println("Enter monthly payments in dollars");
		double monthlyAmount = reader.nextDouble();
		
		//Converts the annual interest rate into monthly interest rate
		double monthlyInterestRate = interestRate / 1200.0;
		
		//Calculates the amount of months needed to pay the loan
		double amountOfMonths = (Math.log(monthlyAmount / (monthlyAmount - monthlyInterestRate * principle)) 
																		/ Math.log(1 + monthlyInterestRate));
		
		//Rounds up the amount of months and calculates the number of years
		double roundedAmountOfMonths = Math.ceil(amountOfMonths);
		double numberOfYears = (double) roundedAmountOfMonths / 12;
		
		//Calculates the total amount paid
		double totalAmountPaid = amountOfMonths * monthlyAmount;
		
		//Calculates the amount added by the interest
		double interestAmount = totalAmountPaid - principle;
		
		//Prints the results
		System.out.println("Months to pay off: " + roundedAmountOfMonths);
		System.out.println("Years to pay off: " + numberOfYears);
		System.out.println("Total amount paid: " + totalAmountPaid);
		System.out.println("Total amount in interest: " + interestAmount);
		
		//Closes the scanner
		reader.close();
	}
}
