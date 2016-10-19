package dawson112.assignments;
import java.util.Scanner;

public class LoanCalculator2 {
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
		
		System.out.println("Enter hourly salary");
		double hourlySalary = reader.nextDouble();
		
		System.out.println("Enter number of hours worked per week");
		double numberOfHoursWorked = reader.nextDouble();
		
		//Declares a constant for the location's minimum wage
		final double MINIMUM_WAGE = 10.75;
		
		//Converts the annual interest rate into monthly interest rate
		double monthlyInterestRate = interestRate / 1200.0;
		
		if (interestRate >= 0 && principle >= 0 && monthlyAmount >= 0 && numberOfHoursWorked >= 0 && hourlySalary >= MINIMUM_WAGE) {
			//Calls the amountOfMonths method
			double amountOfMonths = amountOfMonths(monthlyAmount, monthlyInterestRate, principle);
			
			//Calls the printPayments method
			printPayments(principle, amountOfMonths, monthlyAmount);
			
			//FINANCIAL ADVISOR: Checks if the annual interest rate is over 50%
			if (interestRate > 50) {
				System.out.println("\nWhat were you thinking signing up for that card?\nAre you sure you can get out of that debt?");
			}
			
			//FINANCIAL ADVISOR: Checks if the initial loan is greater than 2 weeks salary
			if (principle > (calculateTakeHomeSalary(numberOfHoursWorked, hourlySalary) * 2)) {
				System.out.println("\nBe very careful. That is a lot of money to borrow!");
			}
			
			//FINANCIAL ADVISOR: Checks if the monthly payment is less than the initial loan
			if (monthlyAmount < principle) {
				System.out.println("\nYou are paying interest, thus paying more for the item than the initial price");
			}
			
		} else {
			//Prints out an error
			System.out.println("Incorrect values!");
		}
		//Closes the scanner
		reader.close();
	}
	
	public static double amountOfMonths(double monthlyAmount, double monthlyInterestRate, double principle) {
		
		//Applies the given formula to calculate the amount of months needed to pay the interest
		double result = (Math.log(monthlyAmount / (monthlyAmount - monthlyInterestRate * principle)) / Math.log(1 + monthlyInterestRate));
		return result;
	}
	
	public static void printPayments(double principle, double amountOfMonths, double monthlyAmount) {
		
		//Rounds up the amount of months and calculates the number of years
		double roundedAmountOfMonths = Math.ceil(amountOfMonths);
		double numberOfYears = (double) roundedAmountOfMonths / 12;
		
		//Calculates the total amount paid
		double totalAmountPaid = amountOfMonths * monthlyAmount;
		
		//Calculates the amount added by the interest
		double interestAmount = totalAmountPaid - principle;
		
		//Checks if the number of months is valid
		if (Double.isNaN(roundedAmountOfMonths)) {
			//Prints an error
			System.out.println("You are being charged more in interest than you are paying.");
		} else {
			//Prints the results
			System.out.println("Months to pay off: " + roundedAmountOfMonths);
			System.out.println("Years to pay off: " + numberOfYears);
			System.out.println("Total amount paid: " + totalAmountPaid);
			System.out.println("Total amount in interest: " + interestAmount);
		}
	}
	
	public static double calculateTakeHomeSalary(double hours, double salary) {
		//Calculates the net salary
		double takeHomeSalary = (double) ((hours * salary) * 2) / 3;
		return takeHomeSalary;
	}
}