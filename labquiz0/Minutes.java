/**
 * Minutes.java - prints out the hours from two times that you get from the user and shows
 * The hours and minutes that equals
 *
 * @author Corey Caldwell
 * @version 2/1/2016
 */
 import java.util.Scanner;
 
public class Minutes{
	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
		int userInput1;
		int userInput2;
		int totalTime;
		int userHours;
		int userMinutes;
		int userDays;
		int leftOverMinutes;
		final int MINUTE = 1;
		final int HOUR = 60;
		final int DAY = 60*24;
		
		System.out.print("\nPlease enter a time in minutes: ");
		userInput1 = scan.nextInt();
		System.out.print("Please enter another time in minutes: ");
		userInput2 = scan.nextInt();
		
		totalTime = userInput1 + userInput2;
		leftOverMinutes = totalTime;
		
		//System.out.println(leftOverMinutes);
		
		userDays = leftOverMinutes / DAY;
		leftOverMinutes -= userDays * DAY; 
		//System.out.println(userDays);
		//System.out.println(leftOverMinutes);
		
		userHours = leftOverMinutes / HOUR;
		leftOverMinutes -= userHours * HOUR; 
		//System.out.println(userHours);
		//System.out.println(leftOverMinutes);
		
		userMinutes = leftOverMinutes / MINUTE;
		leftOverMinutes -= userMinutes * MINUTE;
		//System.out.println(userMinutes);
		//System.out.println(leftOverMinutes);
		
		System.out.println("\n" + userInput1 + " minutes plus " + userInput2 + " minutes is " + 
		totalTime + " minutes.\nwhich is " + userDays + " days, " + userHours + " hours, and " + userMinutes +
		" minutes.");		
	}
}