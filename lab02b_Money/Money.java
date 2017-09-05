/**
 * Plus.java - prints stuff formatted just so.
 *
 * @author Corey Caldwell
 * @version 1/24/2016
 */
import java.util.Scanner;
public class Money {
	
	public static void main(String args[]) {

		// String name;
		// int pennies;
		// double accountBalance;
		//
		// name = "Ada Locelace";
		// pennies = 24+37;
		// accountBalance = initialBalance + deposits - withdrawels;
		// pennies = pennies - 2;

		// VARIABLES FOR EACH TYPE OF COIN AND DOLLAR
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a dollar amount: ");
		int dollarAmount = scan.nextInt();
		System.out.println("Please enter a change amount: ");
		int changeAmount = scan.nextInt();
		
		int twenties;
		int tens;
		int fives;
		int ones;
		int quarters;
		int dimes;
		int nickels;
		int pennies;

		// CREATING CONSTANT VALUES FOR EACH TYPE OF COIN AND DOLLAR
		final int DOLLARS_IN_TWENTY = 20;
		final int DOLLARS_IN_TEN = 10;
		final int DOLLARS_IN_FIVE = 5;
		final int QUARTERS_VALUE = 25;
		final int DIMES_VALUE = 10;
		final int NICKELS_VALUE = 5;
		final int PENNIES_VALUE = 1;

		// System.out.println("\n"+DOLLARS_IN_TWENTY % 1);
		// System.out.println(DOLLARS_IN_TWENTY % 2);
		// System.out.println(DOLLARS_IN_TWENTY % 3);
		//
		// System.out.println("\n"+DOLLARS_IN_TEN % 1);
		// System.out.println(DOLLARS_IN_TEN % 2);
		// System.out.println(DOLLARS_IN_TEN % 3);
		//
		// System.out.println("\n"+DOLLARS_IN_FIVE % 1);
		// System.out.println(DOLLARS_IN_FIVE % 2);
		// System.out.println(DOLLARS_IN_FIVE % 3);

		// PRINTING OUT THE DOLLAR AND CHANGE AMOUNT
		System.out.println(dollarAmount + " dollars and " + changeAmount + " cents is:");

		// FINDING NUMBER OF TWENTIES THEN CHANING TOTAL DOLLAR AMOUNT
		twenties = dollarAmount / DOLLARS_IN_TWENTY;
		dollarAmount -= twenties * DOLLARS_IN_TWENTY;
		// FINDING NUMBER OF TENS THEN CHANING TOTAL DOLLAR AMOUNT
		tens = dollarAmount / DOLLARS_IN_TEN;
		dollarAmount -= tens * DOLLARS_IN_TEN;
		// FINDING NUMBER OF FIVES THEN CHANING TOTAL DOLLAR AMOUNT
		fives = dollarAmount / DOLLARS_IN_FIVE;
		dollarAmount -= fives * DOLLARS_IN_FIVE;
		// REMAINDING VALUE IS THE NUMBER OF ONES
		ones = dollarAmount;
		// FINDING THE NUMBER OF QUARTERS THEN CHANGING THE REMAINING CHANGE AMOUNT
		quarters = changeAmount / QUARTERS_VALUE;
		changeAmount -= quarters * QUARTERS_VALUE;
		// FINDING THE NUMBER OF DIMES THEN CHANGING THE REMAINING CHANGE AMOUNT
		dimes = changeAmount / DIMES_VALUE;
		changeAmount -= dimes * DIMES_VALUE;
		// FINDING THE NUMBER OF NICKELS THEN CHANGING THE REMAINING CHANGE
		// AMOUNT
		nickels = changeAmount / NICKELS_VALUE;
		changeAmount -= nickels * NICKELS_VALUE;
		// REMAINDING VALUE IS THE NUMBER OF PENNIES
		pennies = changeAmount / PENNIES_VALUE;
		// PRINTING OUT THE NUMBER OF EACH TYPE OF COIN AND BILL
		System.out.println("\t" + twenties + " twenty dollar bills");
		System.out.println("\t" + tens + " ten dollar bills");
		System.out.println("\t" + fives + " five dollar bills");
		System.out.println("\t" + ones + " one dollar bills");
		System.out.println("\t" + quarters + " quarters");
		System.out.println("\t" + dimes + " dimes");
		System.out.println("\t" + nickels + " nickels");
		System.out.println("\t" + pennies + " pennies");
	}
}