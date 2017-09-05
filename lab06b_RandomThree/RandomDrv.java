/*
*	RandomDrv.java holds the main method to run the RandomSrv methods.
*
*	@author Corey Caldwell 
*	@version 3/2/16
*
*/

public class RandomDrv {

	public static void main(String[] args) {
		
		int[] counter = RandomSrv.generateNumbers(200, 20);
		RandomSrv.printMethod(counter);
	}

}
