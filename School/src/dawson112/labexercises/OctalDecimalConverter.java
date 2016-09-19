package dawson112.labexercises;
import java.util.Scanner;

public class OctalDecimalConverter {
	public static void main(String[] args) {
		
		//Gets user input for number type
		Scanner reader = new Scanner(System.in);
		System.out.println("Specify number type:");
		String numType = reader.nextLine();
		
		if (numType.equals("Octal") || numType.equals("octal")) {
			
			//Gets user input for number
			System.out.println("Enter octal number:");
			int numberOctal = reader.nextInt();
			
			//Uses the OctalToDecimal method to convert the number
			int numberDecimal = OctalToDecimal(numberOctal);
			
			//Prints the result
			System.out.println(numberOctal + " in decimal is " + numberDecimal);
		} else if (numType.equals("Decimal") || numType.equals("decimal")) {
			
			//Gets user input for number
			System.out.println("Enter decimal number:");
			int numberDecimal = reader.nextInt();
			
			//Uses the DecimalToOctal method to convert the number
			int numberOctal = DecimalToOctal(numberDecimal);
			
			//Prints the result
			System.out.println(numberDecimal + " in octal is " + numberOctal);
			
		} else {
			
			//Throws error if wrong number type is entered
			System.out.println("Incorrect number type");
		}
		
		reader.close();
	}
	public static int OctalToDecimal(int number) {
		
		//Extracts each digit of the number
		int firstDigit = number / 1000;
		int secondDigit = (number % 1000) / 100;
		int thirdDigit = ((number % 1000) % 100) / 10;
		int fourthDigit = ((number % 1000) % 100) % 10;
		
		//Converts the number to decimal
		int firstValue = firstDigit * 512;
		int secondValue = secondDigit * 64;
		int thirdValue = thirdDigit * 8;
		int fourthValue = fourthDigit;
		
		int finalValue = firstValue + secondValue + thirdValue + fourthValue;		
		
		//Returns the final value
		return finalValue;
		
	}
	public static int DecimalToOctal(int number) {
		
		//Extracts each digit of the number
		int firstDigit = number / 512;
		int secondDigit = (number % 512) / 64;
		int thirdDigit = ((number % 512) % 64) / 8;
		int fourthDigit = ((number % 512) % 64) % 8;
		
		//Converts the number to octal
		int firstValue = firstDigit * 1000;
		int secondValue = secondDigit * 100;
		int thirdValue = thirdDigit * 10;
		int fourthValue = fourthDigit;
		
		int finalValue = firstValue + secondValue + thirdValue + fourthValue;
		
		//Returns the final value		
		return finalValue;
		
	}
}
