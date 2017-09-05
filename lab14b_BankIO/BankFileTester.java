import java.util.Scanner;

public class BankFileTester {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a file name: ");
		String filename = scan.next();
		BankIO bankio = new BankIO();
		Bank bank = new Bank(0);
		bankio.readFile(filename, bank);
		
		System.out.print("Please enter an output file name: ");
		String outputFilename = scan.next();
		bankio.write(bank, outputFilename);
	}
}