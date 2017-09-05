/***********************
 *
 *   LabQuiz5Srv.java   Write-a-method problems for lab quiz 5. 
 *                      This is the service class.  
 *                      Run LabQuiz5Test.java to test these methods.
 *
 *   Stubs by:   Shawn Brenneman
 *
 *   Methods by: YOURNAME!
 *
 *   Date:     2016-Mar-30
 *
 ***********************/

 public class LabQuiz5Srv {

	 //---------------------------------------------------------------------------
	 //  multString - returns a String that is str concatenated num times
	 //
	 //  multString(5,"*-") --> "*-*-*-*-*-"
	 //  multString(2,"ha.") --> "ha.ha."
	 //  multString(1,"Yay!") --> "Yay!"
	 //  multString(0,"Oink") --> ""
	 //  multString(-3,"Hey") --> ""
	 //

	 public String multString(int num, String str){
		String result = "";
		for(int i = 0; i < num; i++){
			result = result + str;
		}
		return result;
	 }


	 //----------------------------------------------------------------------------
	 //  odds - gets an array of ints as a parameter, and returns an array of 
	 //         just the odd ints in the given array.
	 //         The returned array is exactly the size needed to hold the odd numbers.
	 //
	 //  odds({7,3,2,9,6,15}) --> {7,3,9,15}
	 //  odds({3,4,5,6,6}) --> {3,5}
	 //  odds({8,4,8,16})  --> {}
	 //  odds({3}) --> {3}
	 //  odds({}) --> {}
	 //

	 public int[] odds(int[] nums){
		int oddCount = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i]%2 == 0){			
			}
			else{
				oddCount++;
			}
		}
		int a = 0;
		int[] odd = new int[oddCount];
		for(int i = 0; i < nums.length; i++){
			if(nums[i]%2 == 0){			
			}
			else{
				odd[a] = nums[i];
				a++;
			}
		}
		return odd;
	 }

	 //----------------------------------------------------------------------------
	 //  containsDigit - answers if the given String contains a Digit 
	 //
	 //  containsDigit("867-5309") --> true
	 //  containsDigit("Not a number") --> false
	 //  containsDigit("") --> false
	 //  containsDigit("jsmith5@gmail.com") --> true
	 //

	 public boolean containsDigit(String str){
		boolean bool = false;
		char[] output = new char[str.length()];
		for(int i = 0; i < str.length(); i++){
			output[i] = str.charAt(i);
			if(output[i] == '0' || output[i] == '1' || output[i] == '2' || output[i] == '3' || output[i] == '4' ||
			output[i] == '5' || output[i] == '6' || output[i] == '7' || output[i] == '8' || output[i] == '9'){
			bool = true;
			}
		}
		return bool;
	 }

	 //----------------------------------------------------------------------------
	 //  merge - takes two arrays and returns one array that contains all of the
	 //          elements from both arrays interleaved such that the first element
	 //          of the first array is in the first position, the first element of
	 //          the second array is in the second position, and so on.
	 //
	 //  merge({55, 22}, {9, 6}) --> {55, 9, 22, 6}
	 //  merge({1, 3}, {2, 4})--> {1, 2, 3, 4}
	 //  merge({1}, {44, 22}) --> {1, 44, 22}
	 //  merge({3, 1}, {77}) --> {3, 77, 1}
	 //  merge({11, 22, 33, 44, 55}, {777, 888, 999}) --> {11, 777, 22, 888, 33, 999, 44, 55}
	 //  merge({}, {}) --> {}
	 //  merge({1}, {}) --> {1}
	 //  merge({}, {4}) --> {4}

	public int[] merge(int[] arr1, int[] arr2) {
		
		return new int[] {};
	}

	 //----------------------------------------------------------------------------
	 //  isValid - takes an array of characters and returns true only if the array
	 //            is valid. The array is valid if every lowercase character is
	 //            immediately followed by an uppercase character. See the examples
	 //            below.
	 //  
	 //  isValid({}) --> true 
	 //  isValid({'X'}) --> true 
	 //  isValid({'a'}) --> false 
	 //  isValid({'a', 'X'}) --> true 
	 //  isValid({'f', 'g', 'H'}) --> false 
	 //  isValid({'4', 'H', 'G'}) --> true  
	 //  isValid({'2', 'P', 'c'}) --> false 
	 //  isValid({'b', 'C', 'd'}) --> false

	public boolean isValid(char[] arr) {
		boolean result = false;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < 123 && arr[i] > 96){
				if(arr[i+1] > arr.length-1){
					result = false;
				}
				else if(arr[i+1] < 91 && arr[i+1] > 64){
					result = true;
				}
				else{
					result = false;
				}
			}
			if((arr[i] == arr.length-1) && (arr[i] > 123 && arr[i] < 96)){
				result = true;
			}
			else{
				result = false;
			}
		}
		return result;
	}

}
