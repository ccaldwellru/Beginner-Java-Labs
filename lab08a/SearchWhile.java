/**
 * SearchSrv --  
 *			   
 * @author  Corey Caldwell
 * @version 14-Mar-2016
 */ 
public class SearchWhile{
	public int range(int[] a){
		int difference = 0;
		if(a.length != 0){
			int min = a[0];
			int max = a[0];
			int i = 0;
			while(i < a.length){
				if(a[i] > max){
					max = a[i];
				}
				if(a[i] < min){
					min = a[i];
				}
				i++;
			}
			difference = max - min;
		}
		return difference;
	}
	public boolean isFound(int[] a, int b){
		boolean found = false;
		int i = 0;
		if(a.length == 0){
			return false;
		}
		else{
			while(found != true){
				if(i >= a.length){
					break;
				}
				if(a[i] == b){
					found = true;				
				}
				i++;
			}	
		}		
		return found;
	}
	public int timesFound(int[] a, int b){
		int found = 0;
		int i = 0;
		if(a.length != 0){
			while(i < a.length){
				if(a[i] == b){
					found++;
				}
				i++;
			}
		}
		return found;
	}	
	public int[] reverse(int[] a){
		int reversed = 0;
		int i = 0;
		if(a.length != 0){
			while(i < a.length / 2){
				reversed = a[i];
				a[i] = a[a.length - i - 1];
				a[a.length - i - 1] = reversed;
				i++;
			}
		}
		return a;
	}
}