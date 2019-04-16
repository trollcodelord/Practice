package practiceForInterview;

public class Palindromenumber {

	
	public static void ispalindrome(int num) {
		
		int sum =0;
		int r =0;
		int t ;
		
		t = num;
		
		
		while(num>0) {
			r = num%10;
			sum = (sum * 10)+r;
			num = num /10;
		}
		
		
		
		if (t==sum) {
			System.out.println("Palindrone Number");
		}else
		{
			System.out.println("Not Palindrome");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ispalindrome(151);
		ispalindrome(23132);
		ispalindrome(10);
		
		// TODO Auto-generated method stub
		
		
		

	}

}
