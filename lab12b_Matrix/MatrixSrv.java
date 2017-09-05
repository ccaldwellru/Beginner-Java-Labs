import java.util.Arrays;

public class MatrixSrv {
	public int sum(int[][] arr1){
		int sum = 0;
		if(arr1.length > 0){
			for (int a = 0; a < arr1.length; a++){
				for (int b = 0; b < arr1[a].length; b++){
					sum += arr1[a][b];
				}
			}
		}
		return sum;
	}
	public int min(int[][] arr1){
		int min = arr1[0][0];
		if(arr1.length > 0){
			for (int a = 0; a < arr1.length; a++){
				for (int b = 0; b < arr1[a].length; b++){
					if(arr1[a][b] < min){
						min = arr1[a][b];
					}
				}
			}
		}
		return min;
	}
	public int max(int[][] arr1){
		int max = arr1[0][0];
		if(arr1.length > 0){
			for (int a = 0; a < arr1.length; a++){
				for (int b = 0; b < arr1[a].length; b++){
					if(arr1[a][b] > max){
						max = arr1[a][b];
					}
				}
			}
		}
		return max;
	}
	public int range(int[][] arr1){
		int max = arr1[0][0];
		int min = arr1[0][0];
		if(arr1.length > 0){
			for (int a = 0; a < arr1.length; a++){
				for (int b = 0; b < arr1[a].length; b++){
					if(arr1[a][b] > max){
						max = arr1[a][b];
					}
					if(arr1[a][b] < min){
						min = arr1[a][b];
					}
				}
			}
		}
		int range = max - min;
		return range;
	} 
	public int[] sumRows(int[][] arr1){
		int[] arr2 = new int[arr1.length];
		int sum = 0;
		int count = 0;
		if(arr1.length > 0){
			for (int a = 0; a < arr1.length; a++){
				for (int b = 0; b < arr1[a].length; b++){
					sum += arr1[a][b];
				}
				arr2[count] = sum;
				count++;
				sum = 0;
			}
		}
		return arr2;
	}
	public boolean isFound(int[][] arr1, int num){
		boolean result = false;
		for (int a = 0; a < arr1.length; a++){
			for (int b = 0; b < arr1[a].length; b++){
				if(num == arr1[a][b]){
					result = true;
				}
			}
		}
		return result;
	}
	public String print(int[][] arr1){
		String str = "";
		for (int a = 0; a < arr1.length; a++){
			for (int b = 0; b < arr1[a].length; b++){
				str += " " + arr1[a][b];
			}
			str += "\n";
		}
		return str;
	}
}