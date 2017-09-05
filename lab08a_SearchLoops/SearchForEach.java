/**
 * SearchSrv --  
 *			   
 * @author  Corey Caldwell
 * @version 14-Mar-2016
 */ 
public class SearchForEach{
	public int range(int[] a){
		int difference = 0;
		if(a.length != 0){
			int min = a[0];
			int max = a[0];
			for(int num : a){
				if(num > max){
					max = num;
				}
				if(num < min){
					min = num;
				}
			}
			difference = max - min;
		}
		return difference;
	}
	public boolean isFound(int[] a, int b){
		boolean found = false;
		if(a.length == 0){
			return false;
		}
		else{
			for(int num : a){
				if(num == b){
					found = true;				
				}
			}	
		}		
		return found;
	}
	public int timesFound(int[] a, int b){
		int found = 0;
		for(int num : a){
			if(num == b){
				found++;
			}
		}
		return found;
	}	
	public int[] reverse(int[] a){
		int reversed = 0;
		for(int i = 0; i < a.length / 2; i++){
			reversed = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = reversed;
		}
		return a;
	}
}