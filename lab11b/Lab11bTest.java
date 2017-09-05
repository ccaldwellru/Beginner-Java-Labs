/**
*
*	Lab11bTest.java - Reads in a csv and prints out the high, low, and average
*
*	@Corey Caldwell
*	@4/8/2016
*/


import java.io.*;
import java.util.Scanner;

public class Lab11bTest
{
    public static void main(String[] args) throws IOException 
    {
		
		FileReader fileRead = new FileReader("scores.csv");
		String line = "";
		
		while(fileRead.hasNext()){
			int high = 0;
			int low = 100;
			double sum = 0;
			int numCount = 0;
			double avg = 0.0;
			line = fileRead.nextLine();
			Scanner scan = new Scanner(line).useDelimiter(",");
			while(scan.hasNextInt()){
				numCount++;
				int nextInt = scan.nextInt();
				if(nextInt < low){
					low = nextInt;
				}
				else if(nextInt > high){
					high = nextInt;
				}
				sum += nextInt;
				System.out.print(nextInt + " ");
			}
			avg = sum/numCount;
			System.out.println("\nHigh: " + high + "   Low: " + low +  "   Average: " + avg + "\n");
		}
		
    }
}
