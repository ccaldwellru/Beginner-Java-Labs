/**
 * Loops.java will ask the user for a starting and an ending number and will print out
 * each number from the start to the end and then print out the sum of those numbers
 *
 * @author Corey Caldwell
 * @version 2/10/2016
 */
import java.util.Scanner;

public class Loops{
		public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			
			int count;
			int startingNum;
			int endingNum;
			int startingNum2;
			int endingNum2;
			int sumOfNums = 0;
			
			System.out.print("Enter a starting number: ");
			startingNum = scan.nextInt();
			System.out.print("Enter an ending number: ");
			endingNum = scan.nextInt();
			
			count = startingNum;			
			while(count <= endingNum){
				sumOfNums += count;
				System.out.println(count);
				count++;
			}
			System.out.println("\nThe sum of the numbers from " + startingNum 
			+ " to " + endingNum + " is " + sumOfNums);
			
			sumOfNums = 0;
			System.out.print("Enter a starting number: ");
			startingNum2 = scan.nextInt();
			System.out.print("Enter an ending number: ");
			endingNum2 = scan.nextInt();
			count = startingNum2;
			while(endingNum2 <= count){
				sumOfNums += count;
				System.out.println(count);
				count--;
			}
			System.out.println("\nThe sum of the numbers from " + startingNum2 
			+ " to " + endingNum2 + " is " + sumOfNums);
		}
}