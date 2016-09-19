package dawson112.labexercises;
import java.util.Scanner;

public class CheckDigits {
	public static void main(String[] args) {
		
		//Gets the user input
		Scanner reader = new Scanner(System.in);
		int fourDigitNumber = reader.nextInt();
		
		//Finds the values of the four digits individually
		int firstDigit = fourDigitNumber / 1000;		
		int secondDigit = (fourDigitNumber - (firstDigit * 1000)) / 100;		
		int thirdDigit = (fourDigitNumber - (firstDigit * 1000) - (secondDigit * 100)) / 10;		
		int fourthDigit = fourDigitNumber - (firstDigit * 1000) - (secondDigit * 100) - (thirdDigit * 10);
		
		//Calculates the sum and the check digit
		int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;
		int checkDigit = sum % 10;
		
		//Prints the check digit and closes the reader
		System.out.println("Check digit: " + checkDigit);
		reader.close();
	}
	
}
