/**
 * Gen.java - prints out random numbers and tried to get that same number again.
 *
 * @author Corey Caldwell
 * @version 2/17/2016
 */
 import java.util.Random;
 
public class Gen{
	public static void main (String args[]){
		
		int randNumber = 0;
		int randNumber2 = 0;
		double counter = 0;
		double avgCounter = 0;
		double average = 0;
		
		Random  rand = new Random();
		randNumber = rand.nextInt((9) + 1);
		System.out.println("Generated the random number: " + randNumber);
		
		while(counter <= 100){
			randNumber2 = rand.nextInt((9) + 1);	
			System.out.println(randNumber2);
			if(randNumber == randNumber2){
				avgCounter++;
				System.out.print(avgCounter);
				counter++;
			}
			counter++;
		}
		average = counter/avgCounter;
		System.out.println("It took an average of " + String.format("%.2f", average) + " times to generate that number again.");
	}
}