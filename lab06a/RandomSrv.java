/*
*
*	RandomSrv.java has the methods to count the number of times a random number
*	occurs and will print out a histogram showing that.
*
*	@author Corey Caldwell
*	@version 2/26/16
*
*/
import java.util.Random;

public class RandomSrv {

	public static void printMethod(int num, int numCount) {
		int count = 0;
		String histogram = "";
		while(count <= numCount){
			histogram = histogram + "*";
			count++;
		}
		System.out.println(num + " " + histogram);
	}

	public static void generateNumbers(int total) {
		Random rand = new Random();
		final int UPPER_BOUND = 10;
		int count = 1;
		int zeroCount = 0;
		int oneCount = 0;
		int twoCount = 0;
		int threeCount = 0;
		int fourCount = 0;
		int fiveCount = 0;
		int sixCount = 0;
		int sevenCount = 0;
		int eightCount = 0;
		int nineCount = 0;
		
		while(count <= total){
			int currentNum = rand.nextInt(UPPER_BOUND);
			switch (currentNum){
				case 0: zeroCount++;
						break;
				case 1: oneCount++;
						break;
				case 2: twoCount++;
						break;
				case 3: threeCount++;
						break;
				case 4: fourCount++;
						break;
				case 5: fiveCount++;
						break;
				case 6: sixCount++;
						break;
				case 7: sevenCount++;
						break;
				case 8: eightCount++;
						break;
				case 9: nineCount++;
						break;
			}
			count++;
		}
		RandomSrv.printMethod(0, zeroCount);
		RandomSrv.printMethod(1, oneCount);
		RandomSrv.printMethod(2, twoCount);
		RandomSrv.printMethod(3, threeCount);
		RandomSrv.printMethod(4, fourCount);
		RandomSrv.printMethod(5, fiveCount);
		RandomSrv.printMethod(6, sixCount);
		RandomSrv.printMethod(7, sevenCount);
		RandomSrv.printMethod(8, eightCount);
		RandomSrv.printMethod(9, nineCount);
	}
}
