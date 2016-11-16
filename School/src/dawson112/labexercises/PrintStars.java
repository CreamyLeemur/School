package dawson112.labexercises;
import java.util.Scanner;

public class PrintStars {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter amount of rows");
		int m = reader.nextInt();
		
		System.out.println("Enter amount of stars per row");
		int n = reader.nextInt();
		
		for (int counter = 1; counter <= m; counter++) {
			for (int counter2 = 1; counter2 <= n; counter2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
