package dawson112.assignments;
import java.util.Scanner;

public class SinPrinter {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		//Gets user input		
		System.out.println("Enter the lower bound");
		int min = reader.nextInt();
		
		System.out.println("Enter the upper bound");
		int max = reader.nextInt();
		
		//Used to count the amount of total SINs in the range
		int loopCount = 0;
		
		//Calls the sumDigits method and the isValidSin method for the amount of SINs
		//that need to be checked
		for (int counter = min; counter <= max; counter++) {
			
			//Checks if the current SIN is valid
			if (isValidSin(sumDigits(counter))) {
				
				//If it is, prints it to the console
				System.out.print(counter + " ");
				
				//Increments the loop count every time it finds a valid SIN
				loopCount++;
				
				//Limits the amount of SINs to 12 per line
				if (loopCount % 12 == 0) {
					System.out.print("\n");
				}
			}
		}
		
		//Prints the final result
		System.out.println("\nThere are " + loopCount + " total valid social insurance numbers in the range you specified");		
	}
	public static int sumDigits(int sinNumberInt) {
		
		//Converts the int to a string
		String sinNumberString = String.valueOf(sinNumberInt);
		
		int sum = 0;
		
		//For every character in the sin number, apply the given formula
		for (int counter = 0; counter <= 8; counter++) {
			
			//Gets the current digit using string manipulation
			int currentDigit = Character.getNumericValue(sinNumberString.charAt(counter));
			int product;
			
			//If the current digit's position is a multiple of 2, multiply it by 2.
			//Else, just assign it's value to product as multiplying by 1 gives the same result.
			//It's inverted in the following statements as the counter starts at 0 instead of 1.
			if (counter % 2 == 0) {
				product = currentDigit;
			} else {
				product = currentDigit * 2;
			}
			
			//If the product has 2 digits, we add them. This is a simpler way of doing
			//so as the sum of the two is the product -9.
			if (product > 9) {
				product -= 9;
			}
			
			//Adds the current product to the sum
			sum += product;
		}
		return sum;
	}
	public static boolean isValidSin(int sum) {
		
		//If the sum of the checksum ends in a 0, it's valid
		return sum % 10 == 0;
	}
}