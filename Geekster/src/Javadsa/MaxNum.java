package Javadsa;

public class MaxNum {
	
public static void main(String []args) {
		
		int []arr = {1,3,56,67,8,9,34,57,90};
		
		if(arr.length > 0) {
			
			int max = arr[0];
			
			for(int i=0;i<arr.length;i++) {
				if(max < arr[i]) {
					max = arr[i];
				}
			}
			System.out.println("Max number is "+ max);
		}
	}

}
