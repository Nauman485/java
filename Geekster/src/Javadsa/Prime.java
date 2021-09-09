package Javadsa;

public class Prime {
	
	public static void main(String []args) {
		
		int n = 23434;
		int m =n/2;
		boolean flag =false;
		
		if(n==0 || n==1) {
			
			System.out.println("Number is not Prime");
		}
		else {
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println("Number is not Prime");
					flag =true;
					break;
				}
				
			}
			if(flag == false) {
			System.out.println("Number is Prime");
			}
		}
	}

}
