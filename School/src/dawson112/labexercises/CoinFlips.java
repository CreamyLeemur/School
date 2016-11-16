package dawson112.labexercises;
import java.util.Scanner;

public class CoinFlips {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter amount of flips");
		int maxFlips = reader.nextInt();
		
		System.out.println(multiCoinFlip(maxFlips));
	}
	
	public static double multiCoinFlip(int maxFlips) {
		int numFlips = 0;
		int numHeads = 0;
		while (numFlips < maxFlips) {
			if (flipCoin()) {
				numHeads++;
			}
			numFlips++;
		}
		
		return  numHeads * 100.0 / numFlips;
	}
	
	public static boolean flipCoin() {
		System.out.println("Flipped!");
		return Math.random() < .5;
		
	}
}
