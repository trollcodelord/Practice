package practiceForInterview;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		if(isPrime(n)) {
			
			System.out.println(n+"Number is prime");
		}else
		{
			System.out.println(n+"Number is not prime");
			
		}
	}
	
		
		
		public static boolean isPrime(int n) {
			
			if(n<=1) {
				return false;
		}
			
			for (int i=2;i<n;i++)
			{
				if (n%i==0) {
					return false;
				}
			}
			return true;
		

	}

}
