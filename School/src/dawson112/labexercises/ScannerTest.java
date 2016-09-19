package dawson112.labexercises;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		
		System.out.println(number);
		reader.close();
		
	}
}
