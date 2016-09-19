package dawson112.labexercises;
import java.util.Scanner;

public class ToPowersOf2 {
	public static void main(String args[]) {
		
		//Creates scanner and gets input
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = reader.nextInt();
		
		//Calculates the amount of each number and prints it
		int oneTwentyEight = (number / 128) * 128;
		System.out.println(oneTwentyEight);
				
		int sixtyFour = (number - oneTwentyEight) / 64 * 64; 
		System.out.println(sixtyFour);
				
		int thirtyTwo = (number - oneTwentyEight - sixtyFour) / 32 * 32;
		System.out.println(thirtyTwo);

		int sixteen = (number - oneTwentyEight - sixtyFour - thirtyTwo) / 16 * 16;
		System.out.println(sixteen);
		
		int eight = (number - oneTwentyEight - sixtyFour - thirtyTwo - sixteen) / 8 * 8;
		System.out.println(eight);
		
		int four = (number - oneTwentyEight - sixtyFour - thirtyTwo - sixteen - eight) / 4 * 4;
		System.out.println(four);
		
		int two = (number - oneTwentyEight - sixtyFour - thirtyTwo - sixteen - eight - four) / 2 * 2;
		System.out.println(two);
		
		int one = (number - oneTwentyEight - sixtyFour - thirtyTwo - sixteen - eight - four - two);
		System.out.println(one);
		
		//Closes the reader
		reader.close();
	}
}
