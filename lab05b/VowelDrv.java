/*
*	VowelDrv.java holds the main method to run the vowelsrv methods.
*
*	@author Corey Caldwell 
*	@version 2/21/16
*
*/

import java.util.Scanner;

public class VowelDrv {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userInput = "";
		System.out.print("Enter a sentence to find out how many vowels: ");
		userInput = scan.nextLine();
		scan.close();		
		System.out.println(VowelSrv.vowelCount(userInput));
		System.out.println(VowelSrv.vowelString(userInput));
	}

}
