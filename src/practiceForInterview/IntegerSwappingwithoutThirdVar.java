package practiceForInterview;

public class IntegerSwappingwithoutThirdVar {

	
	public static void main(String[] args) {
		
		
		int x = 10;
		int y = 5;
		
		x = x*y;
		y = x/y;
		x = x/y;
		System.out.println(x);
		System.out.println(y);
		
		
		
		x = x+y;
		y = x-y;
		x = x-y;	
		System.out.println(x);
		System.out.println(y);
		
		
	}
	
}
