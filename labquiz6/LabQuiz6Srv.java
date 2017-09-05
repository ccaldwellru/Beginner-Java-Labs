/**
 * LabQuiz6Srv.java - methods that operate on 2D arrays
 *
 * @author Shawn Brenneman
 * @version 11/30/2015
 */
public class LabQuiz6Srv {

    //-----------------------------------------------------------------
    // indexOfLargestRow - takes a 2D array of ints and returns the 
    //                     index of the row with the largest sum.  If
    //                     the array is empty, returns -1.
    //-----------------------------------------------------------------
    public int indexOfLargestRowSum(int[][] nums2d) {
		
		int currentSum = 0;
		int largestIndex = 0;
		if(nums2d.length <= 0){
			largestIndex = -1;
			return largestIndex;
		}
		int savedSum = 0;
		for(int b = 0; b < nums2d[0].length; b++){
			savedSum += nums2d[0][b];	
		}
		for(int a = 0; a < nums2d.length; a++){
			for(int b = 0; b < nums2d[a].length; b++){
				currentSum += nums2d[a][b];	
			}
			if(currentSum > savedSum){
				savedSum = currentSum;
				largestIndex = a;
			}
			currentSum = 0;
		}
        return largestIndex;
    }

    //-----------------------------------------------------------------
    // largestRowSum - takes a 2D array of ints, and returns the 
    //                 largest sum of all numbers in a row.  If the
    //                 array is empty, returns 0.
    //-----------------------------------------------------------------
    public int largestRowSum(int[][] nums2d) {
        int currentSum = 0;
		int savedSum = 0;
		if(nums2d.length <= 0){
			currentSum = 0;
			return currentSum;
		}
		for(int b = 0; b < nums2d[0].length; b++){
			savedSum += nums2d[0][b];	
		}
		for(int a = 0; a < nums2d.length; a++){
			for(int b = 0; b < nums2d[a].length; b++){
				currentSum += nums2d[a][b];	
			}
			if(currentSum > savedSum){
				savedSum = currentSum;
			}
			currentSum = 0;
		}
        return savedSum; 
    }

    //-----------------------------------------------------------------
    // allPos - takes a 2D array of ints and returns true if all the
    //          integers in the 2D array are positive.  0 is neither
    //          positive or negative.  If the array is empty, returns
    //          false.
    //-----------------------------------------------------------------
    public boolean allPos(int[][] nums2d) {
        boolean result = false;
		if(nums2d.length <= 0){
			return result;
		}
		for(int a = 0; a < nums2d.length; a++){
			for(int b = 0; b < nums2d[a].length; b++){
				if(nums2d[a][b] <= 0){
					result = false;
					return result;
				}
				else if(nums2d[a][b] > 0){
					result = true;
				}
				
			}
		}
		return result; 
    }

    //-----------------------------------------------------------------
    // allDigits - takes a 2D array of characters and answers if every
    //             char in the array is a digit.  If the array is
    //             empty, returns false.
    //-----------------------------------------------------------------
    public boolean allDigits(char[][] chars2d) {
        boolean result = false;
		if(chars2d.length <= 0){
			return result;
		}
		for(int a = 0; a < chars2d.length; a++){
			for(int b = 0; b < chars2d[a].length; b++){
				if(chars2d[a][b] >= 48 && chars2d[a][b] <= 57){
					result = true;
				}
				else{
					result = false;
					return result;
				}
				
			}
		}
		return result; 
    }

    //-----------------------------------------------------------------
    //  isJagged - takes a 2D array of ints and returns true only if
    //             the array is jagged.  If the array is empty, returns
    //             false.
    //-----------------------------------------------------------------
    public boolean isJagged(int[][] nums2d) {
        boolean result = false;
		for(int a =0; a < nums2d.length; a++){
			if(a+1 < nums2d.length -1){
				if(nums2d[a].length > nums2d[a+1].length || nums2d[a].length > nums2d[a+1].length){
					result = true;
					return result;
				}
				else{
					result = false;
				}
			}
		}
		return result;
    }

    //-----------------------------------------------------------------
    //  rows2strings - takes a 2D array of char and returns a one
    //                 dimensional array of Strings where each String
    //                 is all the characters in a row concatenated
    //                 together.
    //-----------------------------------------------------------------
    public String[] rows2strings(char[][] chars2d) {
        String[] arr = new String[chars2d.length];
		int count = 0;
		String result = "";
		for(int a = 0; a < chars2d.length; a++){
			for(int b = 0; b < chars2d[a].length; b++){
				result = result + chars2d[a][b];
			}
			arr[count] = result;
			count++;
			result = "";
		}
		return arr;
    }

    //-----------------------------------------------------------------
    //  isMirror - takes two arrays of chars and returns true if one
    //             array is exactly like the other except with the
    //             order reversed.
    //-----------------------------------------------------------------
    public boolean isMirror(char[] arr1, char[] arr2) {
        boolean result = false;
		int count = arr2.length - 1;
		if(arr1.length == 0 && arr2.length == 0){
			result = true;
			return result;
		}
		if(arr1.length != arr2.length){
			return result;
		}
		for(int i = 0; i < arr1.length; i++){
			if(i+1 < arr2.length){
				if(arr1[i] == arr2[count]){
					count--;
					result = true;
				}
				else{
					result = false;
					return result;
				}
			}
		}
		return result;
    }


}
