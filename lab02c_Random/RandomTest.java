/**
 * Random.java - prints out random numbers from the users range.
 *
 * @author Corey Caldwell
 * @version 1/29/2016
 */
 import java.util.Random;
 import java.util.Scanner;
 
public class RandomTest{
	public static void main (String args[]){
		//creating the variables I will need throughout the program
		//one for the min and max numbers and one for the random number
		int minNumber;
		int maxNumber;
		int randNumber;
		//Creating the scanner and random object
		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();
		//Asks the user for the min number and saves it in the minNumber variable
		System.out.print("Please enter a minimum number: ");
		minNumber = scan.nextInt();
		//Asks the user for a max number and saves it in the maxNumber variable
		System.out.print("Please enter a maximum number: ");
		maxNumber = scan.nextInt();
		//Telling the user that we are generating 20 numbers in their range
		System.out.println("\nGenerating 20 numbers in the range [" + minNumber + "," + maxNumber + "]");
		//The 20 numbers that are printed out to the users screen using a for loop
		for(int i = 0; i < 20; i++){
			randNumber = rand.nextInt((maxNumber - minNumber) + 1) + minNumber;
			System.out.println(randNumber);
		}	
		
	}
}