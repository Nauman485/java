package Javadsa;

public class SumN {

	public static void main(String []args) {
		
		int []arr = {1,3,56,67,8,9,34,57};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			int ele=arr[i];
			sum = sum+ele;
		}
		System.out.println(sum);
	}
}

