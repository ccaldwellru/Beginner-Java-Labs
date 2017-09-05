import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class BankIO {
	public static void readFile(String filename, Bank bank) {
			Scanner scan;
		try {
			scan = new Scanner(new File(filename));
			while(scan.hasNext()){
			readAccount(scan);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("There is no file found: " + e);
		}
		
	}
	
	public static BankAccount readAccount(Scanner in){
		Scanner scan = in;
		int accountNumber = 0;
		double accountBalance = 0;
		accountNumber = scan.nextInt();
		accountBalance = scan.nextDouble();
		BankAccount bankacc = new BankAccount(accountBalance, accountNumber);
		return bankacc;
	}
	
	public static void write(Bank b, String filename){
		PrintWriter out;
		try {
			out = new PrintWriter(new FileWriter(filename, true));
			out.println(b);
		}
		catch (FileNotFoundException e) {
			System.out.println("There is no file found: " + e);
		}
		catch (Exception io) {
			System.out.println("There was an error: " + io);
		}
	}
	
}