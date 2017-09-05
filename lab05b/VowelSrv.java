/*
*
*	VowelSrv.java has the methods to count the number of vowels in one method
*	and the other to print out a string of the vowels in the string.
*
*	@author Corey Caldwell
*	@version 2/21/16
*
*/

public class VowelSrv {

	public static int vowelCount(String s) {
		int count = 0;
		int numOfVowels = 0;
		while (count <= s.length() - 1) {
			if ((s.charAt(count) == 'A' || s.charAt(count) == 'a') || (s.charAt(count) == 'E' || s.charAt(count) == 'e')
					|| (s.charAt(count) == 'I' || s.charAt(count) == 'i')
					|| (s.charAt(count) == 'O' || s.charAt(count) == 'o')
					|| (s.charAt(count) == 'U' || s.charAt(count) == 'u')) {

				numOfVowels++;
				count++;
			} else {
				count++;
			}
		}
		return numOfVowels;

	}

	public static String vowelString(String s) {
		int count = 0;
		String result = "";
		if ((s.charAt(count) == 'A' || s.charAt(count) == 'a') || (s.charAt(count) == 'E' || s.charAt(count) == 'e')
				|| (s.charAt(count) == 'I' || s.charAt(count) == 'i')
				|| (s.charAt(count) == 'O' || s.charAt(count) == 'o')
				|| (s.charAt(count) == 'U' || s.charAt(count) == 'u')) {

			result = result + s.charAt(count);
			count++;
		} else {
			count++;
		}
		return result;
	}
}
