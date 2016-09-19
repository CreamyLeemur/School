package dawson112.labexercises;
import java.util.Scanner;

public class ToPowersOf10 {
	public static void main(String[] args) {
		
		//Creates scanner and gets input
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = reader.nextInt();
		
		//Calculates the hundreds, tens and ones and prints it
		int hundreds = (number / 100) * 100;
		System.out.println(hundreds);
		
		int tens = (number - hundreds) / 10 * 10; 
		System.out.println(tens);
		
		int ones = (number - hundreds - tens);
		System.out.println(ones);
		
		//Closes reader
		reader.close();
	}
}