package practiceForInterview;

public class ConvertIntoSingledigit {

	// convert 123123 = 1+2+3+1+2+3 = 12 = 1+2 =3
	
	
	public static void  main(String[] args) {
		
		int n = 53421;
		int sum = 0;
		
		while (n == 0) {
			 n = sum;
			 sum = 0;	 
		}
		
		sum = sum + n%10;
		n=n/10;
		
		System.out.println(sum);
		
		
		
	}
	
	
}
