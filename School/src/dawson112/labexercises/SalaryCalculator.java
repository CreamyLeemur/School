package dawson112.labexercises;
import java.util.Scanner;

public class SalaryCalculator {
	public static void main(String args[]) {
		//Ask user for salary and work time
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter salary");
		double salary = reader.nextDouble();
		
		System.out.println("Enter work time");
		double workTime = reader.nextDouble();
		
		//Declares the pay double
		double totalPay = 0;
		
		//Checks if work time is over 40 hours
		if(workTime > 40) {
			double overtime = workTime - 40;
			totalPay = (1.5 * salary * overtime) + (salary * 40);
		} else {
			totalPay = (salary * workTime);
		}
		
		//Prints the result
		System.out.println("Total pay: " + totalPay);
		
		//Closes the reader
		reader.close();
		
	}
}
