package practiceForInterview;

public class ReverseIntger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =53241 ;
		//task is to revese 53241 into 14235
		
		int reverse = 0 ;
		
		
		while(n	!= 0) {
			
			reverse = reverse*10 + n % 10;
			n = n /10;
		}
		
		System.out.println(reverse);
		
		
		// Using StringBuffer
	//	 System.out.println(new StringBuffer(String.valueOf(n)).reverse());
		
		
	}

}
