/**
 * Loops.java will ask the user for a starting and an ending number and will print out
 * each number from the start to the end and then print out the sum of those numbers
 *
 * @author Corey Caldwell
 * @version 2/10/2016
 */
import java.util.Scanner;

public class VowelCount{
	public static void main(String ags[]){
		Scanner scan = new Scanner(System.in);
		boolean quit = false;
		int count = 0;
		String userString = "";
		String vowelString = "";
		
		while(quit = false){
			System.out.print("Welcome to the vowel counter.\nEnter a sentence (type quit to quit): ");
			userString = scan.nextLine();
			if(userString.equalsIgnoreCase("quit")){
				quit = true;
				break;
			}
			while(count < userString.length()){
				if(userString.charAt(count)){
					
				}
			}
		}
	}
}