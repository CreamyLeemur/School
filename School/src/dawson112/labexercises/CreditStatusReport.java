package dawson112.labexercises;
import java.util.Scanner;

public class CreditStatusReport {
	public static void main(String args[]) {
		
		//Gets user input and converts dollars to cents
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter account number");
		String accountNumber = reader.nextLine();
		
		System.out.println("Enter monthly balance");
		double monthlyBalance = reader.nextDouble();
		
		System.out.println("Enter monthly charges");
		double monthlyCharges = reader.nextDouble();
		
		System.out.println("Enter monthly credits");
		double monthlyCredits = reader.nextDouble();
		
		System.out.println("Enter credit limit");
		double creditLimit = reader.nextDouble();
		
		//Calculates the account balance
		double accountBalance = (monthlyBalance + monthlyCharges - monthlyCredits);
		
		//Declares the credit message string
		String creditMessage = "";
		
		//Checks if the account balance exceeds the monthly credit limit
		if(accountBalance > creditLimit) {
			//Sets the credit message to be "Credit limit exceeded"
			creditMessage = "CREDIT LIMIT EXCEEDED";
		}
		
		//Prints the results
		System.out.println("********** Credit Status Report **********");
		System.out.println("\nAccount number: " + accountNumber);
		System.out.println("Monthly balance: " + monthlyBalance);
		System.out.println("Monthly charges: " + monthlyCharges);
		System.out.println("Monthly credits: " + monthlyCredits);
		System.out.println("Credit limit: " + creditLimit);
		System.out.println("\nNew balance: " + accountBalance + " " + creditMessage);
		
		//Closes the reader
		reader.close();
	}
}
