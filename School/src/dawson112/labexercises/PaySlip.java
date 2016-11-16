package dawson112.labexercises;
import java.util.Scanner;

public class PaySlip {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter hours worked");
		int hoursWorked = reader.nextInt();
		
		System.out.println("Enter salary");
		double salary = reader.nextDouble();
		
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Hourly rate: " + salary + "\n");
		
		double grossPay = hoursWorked > 40 ? calculateOverTimePay(hoursWorked, salary) : calculateRegularPay(hoursWorked, salary);
		System.out.println("Gross Pay: " + grossPay);
		
		double taxes = calculateTaxes(grossPay);
		System.out.println("Taxes: " + taxes);
		
		double netPay = calculateNetPay(grossPay, taxes);
		System.out.println("Net Pay: " + netPay);
	}
	
	public static double calculateRegularPay(int hoursWorked, double salary) {
		double regularPay = hoursWorked * salary;
		return regularPay;
	}
	
	public static double calculateOverTimePay(int hoursWorked, double salary) {
		
		double overTimePay = hoursWorked > 54 ? ((hoursWorked - 54) * 2 * salary) + (hoursWorked - 40) * 1.5 * salary : (40 * salary) + (hoursWorked - 40) * 1.5 * salary ;
		return overTimePay;
	}
	
	public static double calculateTaxes(double grossPay) {
		double taxes = grossPay > 500 ? grossPay * 0.4 : grossPay * 0.3;
		return taxes;
	}
	
	public static double calculateNetPay(double grossPay, double taxes) {
		double netPay = grossPay - taxes;
		return netPay;
	}
}