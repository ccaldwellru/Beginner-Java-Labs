import java.io.*;
import java.util.Scanner;

public class L12aTest
{
    public static void main(String[] args) throws IOException 
    {
		Scanner filRead = new Scanner("quiz_scores.csv");
		String line = "";		
		while(fileRead.hasNext()){
			int high = 0;
			int low = 100;
			double sum = 0;
			int numCount = 0;
			double avg = 0.0;
			line = fileRead.nextLine();
			Scanner scan = new Scanner(line).useDelimiter(",");
			while(scan.hasNext()){
				String name = scan.next();
			}
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
			System.out.println("\nName: " + name + "High: " + high + "   Low: " + low +  "   Average: " + avg + "\n");
		}
    }
}
