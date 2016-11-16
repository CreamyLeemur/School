package dawson112.labexercises;
import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the two integers");
		int x = reader.nextInt();
		int y = reader.nextInt();
		
		int max = x > y ? x : y;
		System.out.println("Max: " + max);
		int min = x < y ? x : y;
		System.out.println("Min: " + min);
		int absValue = x > 0 ? x : -x;
		System.out.println("Absolute value of x: " + absValue);
		String cookies = x == 1 ? "You have " + x + "cookie" : "You have " + x + " cookies";
		System.out.println(cookies);
	}
}