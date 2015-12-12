// Import Scanner for Input to Variable
import java.util.Scanner;

public class Calc {

	// Initialization
	static Scanner user = new Scanner(System.in);
	
	static double stars;
	static double boost;
	static double baseAtk;
	static double boostNum = 0;
	static double totalBoost = 0;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Angel's crappy Star Force attack calculator.");
		System.out.println("Please enter the stuff in so you can be lazy.");
		
		// Get base w.atk or m.atk
		System.out.print("Base Attack: ");
		baseAtk = user.nextInt();
		
		// Get wanted stars
		System.out.print("Stars: ");
		stars = user.nextInt();
		
		do {
			
			boostNum = (boostNum + 1);
			System.out.println("Attack: " + baseAtk);
			boost = Math.floor(baseAtk / 50) + 1;
			System.out.println("Boost #" + boostNum + ": " + boost);
			baseAtk = (baseAtk + boost);
			totalBoost = (totalBoost + boost);
			stars = (stars - 1);
		
			
		} while (stars != 0);
		
		// Print Results
		System.out.println("Resulting Atk: " + baseAtk);
		System.out.println("Total Boost: " + totalBoost);
		
	}
	
}
