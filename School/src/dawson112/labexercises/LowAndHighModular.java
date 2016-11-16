package dawson112.labexercises;
import java.util.Scanner;

public class LowAndHighModular {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter low:");
		int low = reader.nextInt();
		
		System.out.println("Enter high:");
		int high = reader.nextInt();
		
		System.out.println("Enter increment:");
		int increment = reader.nextInt();
		
		if (high > low) {
			printArithmeticSeries(low, high, increment);
			printGeometricSeries(low, high, increment);
		}
	}
	
	public static void printArithmeticSeries(int low, int high, int increment) {
		int counter = low;
		while (counter <= high) {
			System.out.println(counter);
			counter = counter + increment;
		}
	}
	
	public static void printGeometricSeries(int low, int high, int increment) {
		int counter = low;
		while (counter <= high) {
			System.out.println(counter);
			counter = counter * increment;
		}
	}
}