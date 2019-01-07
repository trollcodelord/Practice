package practiceForInterview;

import java.util.*;
/**
 * 
 * Program to Check String is Palindrome or not 
 * 
 * @author a121yn0n
 *
 */
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "";
		String reverse ="";
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER NUMBER TO CHECK FOR PALINDROME");
		reverse=in.nextLine();
		
		int length = s.length();
		
		for(int i = length-1;i>=0;i++)
		{
			s=s+reverse.charAt(i);
		}
		
		if (s.equals(reverse))
		{
			System.out.print("YES");
			
			
		}
		
		else
		{
			System.out.println("NO");
		}
		
		
		
	}

}
