package dawson112.assignments;
import java.util.Scanner;

public class SinPrinter {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		//Gets user input
		System.out.println("Enter SIN");
		int sinNumber = reader.nextInt();
		
		//Seperate the SIN number into 9 digits
		int firstDigit = sinNumber / 100000000;
		int secondDigit = (sinNumber % 100000000) / 10000000;
		int thirdDigit = (sinNumber % 1000000) / 100000;
		
		System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit);
		
	}
} 
