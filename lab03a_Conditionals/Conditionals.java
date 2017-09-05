/**
 * Random.java - prints out random numbers from the users range.
 *
 * @author Corey Caldwell
 * @version 1/29/2016
 */
 import java.util.Scanner;
 public class Conditionals{
	 
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String memberStatus;
		String purchaseMembership;
		String studentWithID;
		int age;
		String student;
		final int SENIORS_COST = 18;
		final int ADULTS_COST = 20;
		final int STUDENTS_COST = 14;
		final int MEMBERSHIP_FEE_STUDENT = 40;
		final int MEMBERSHIP_FEE_ADULT = 75;
		
		System.out.print("Welcome to the Radford museum of Fine Art!\nAre you are member (Y or N): ");
		memberStatus = scan.next();
		if(memberStatus.equals("Y")){
			System.out.println("\nEnjoy your day at the Radford museum of Fine Art!");
		}
		else{
			System.out.print("Would you like to become a member today? (Y or N): ");
			purchaseMembership = scan.next();
			if(purchaseMembership.equals("Y")){
				System.out.print("Are you a student (with a valid ID)? (Y or N): ");
				studentWithID = scan.next();
				if(studentWithID.equals("Y")){
					System.out.print("Your admission today will be $40, good for the whole year.\nEnjoy your day at" +
					"the Radford museum of Fine Art!");
				}
				else{
					System.out.print("Your admission today will be $75, good for the whole year.\nEnjoy your day at" +
					"the Radford museum of Fine Art!");
				}
			}
			else{
				System.out.print("What is your age: ");
				age = scan.nextInt();
				if(age <= 12 && age >= 0){
					System.out.print("Enjoy your day at the Radford museum of Fine Art!");
				}
				else if(age > 12 && age <65){
					System.out.print("Your admission today will be $20.\nEnjoy your day at the Radford museum of Fine Art!");
				}
				else{
					System.out.print("Your admissions today will be $18.\nEnjoy your day at the Radford museum of Fine Art!");
				}					
			}
		}
		
	}
 }