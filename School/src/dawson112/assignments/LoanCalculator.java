package dawson112.assignments;
import java.util.Scanner;

public class LoanCalculator {
	public static void main(String[] args) {
		
		//Initializes the scanner
		Scanner reader = new Scanner(System.in);
		
		//Asks the user for input and saves those values as doubles
		System.out.println("Enter principle");
		double principle = reader.nextDouble();
		
		System.out.println("Enter annual interest rate (in percent)");
		double interestRate = reader.nextDouble();
		
		System.out.println("Enter monthly payments in dollars");
		double monthlyAmount = reader.nextDouble();
		
		//Converts the dollars into cents
		principle = principle * 100;
		monthlyAmount = monthlyAmount * 100;
		
		//Converts the annual interest rate into monthly interest rate
		double monthlyInterestRate = interestRate / 1200.0;
		
		int amountOfMonths = (int) Math.ceil((Math.log(monthlyAmount / (monthlyAmount - monthlyInterestRate * principle)) / Math.log(1 + monthlyInterestRate)));
		
		System.out.println(amountOfMonths);
	}
}
