/**
 * Random.java - prints out random numbers and if it's even asks the user to guess
 * if odd the computer prints out a second random number and test it to see if it is 
 * equal to, less than, or greater than the first number.
 *
 * @author Corey Caldwell
 * @version 2/8/2016
 */
import java.util.Random;
import java.util.Scanner;
public class RandomQuiz{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int userNumber;
		int randomNumber;
		int randomNumber2;
		randomNumber = rand.nextInt((11 - 7) + 1) + 7;
		
		if (randomNumber % 2 == 0){
			System.out.println("Can you guess the number between 7 and 11?");
			userNumber = scan.nextInt();
			if(userNumber > randomNumber){
				System.out.println("Your number was too big, the number was " + randomNumber);
			}
			else if(userNumber < randomNumber){
				System.out.println("Your number was too small, the number was " + randomNumber);
			}
			else{
				System.out.println("You guessed correctly! The number was: " + randomNumber);
			}
		}
		else{
			randomNumber2 = rand.nextInt((11 - 7) + 1) + 7;
			System.out.println("The first number, " + randomNumber + ", is odd. The second random number is " 
				+ randomNumber2 + ".");
			if(randomNumber == randomNumber2){
				System.out.println("The two numbers are the same!");
			}
			else if(randomNumber > randomNumber2){
				System.out.println("The first number is larger than the second number.");
			}
			else{
				System.out.println("The first number is larger than the second number.");
			}
		}
	}
}