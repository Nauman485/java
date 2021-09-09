package Javadsa;

public class CountDigit {
	
	public static void main(String[] args) {
		
		int num = 1223;
		int count = 0;
		int r = 0;
		
		while(num>0) {
		   
		    r =r+ (num%10);
			count++;
			num = num/10;
		}
		System.out.println("Number of digit is =" +count);
	}

}
