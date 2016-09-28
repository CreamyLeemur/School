package dawson112.labexercises;
import java.util.Scanner;

public class BankServiceCharge {
	public static void main(String[] args) {
		
		//Gets the user input
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter cheque amount");
		double chequeAmount = reader.nextDouble();
		
		//Declares the variable for the service charge
		double serviceCharge;
		
		//Checks the cheque value and adjusts the service charge accordingly
		if (chequeAmount < 10) {
			serviceCharge = 1;
		} else if (chequeAmount >=10 && chequeAmount < 100) {
			serviceCharge = chequeAmount / 10;
		} else if (chequeAmount >= 100 && chequeAmount < 1000) {
			serviceCharge = (chequeAmount / 20) + 5;
		} else {
			serviceCharge = (chequeAmount / 100) + 40;
		}
		
		//Prints the result
		System.out.println("Cheque amount: " + chequeAmount);
		System.out.println("Service charge: " + serviceCharge);
		
		//Closes the scanner
		reader.close();
	}
}
