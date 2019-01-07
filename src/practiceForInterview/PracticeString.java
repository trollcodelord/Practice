package practiceForInterview;

public class PracticeString {

	
	
	/**
	 * 
	 * 
	Print String "Hello, World" Reverse String
	 * 
	 **/
	
	
	public static void main(String[] args){
		
	
	String abc =  "Hello World";
	
	char[] try1 = abc.toCharArray();
	
	for(int i= try1.length-1;i>=0;i--){
		
		System.out.print(try1[i]);
	}
	
	}
	
}
