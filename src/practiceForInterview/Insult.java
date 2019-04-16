package practiceForInterview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Insult {

	
	
	public static void main(String[] args) {
		
		
//		int n = 234111 ;
//		int sum = 0;
//		int m;
//		
//		while(n>0) {
//			 sum += n % 10; 
//	            n /= 10;
//		}
//		
//		System.out.println(sum);
//		
		
		
//		ArrayList<Integer>  arrayList = new ArrayList<>();
//		Scanner in = new Scanner(System.in);
//		
//		while(true) {
//			int num = Integer.parseInt(in.nextLine());
//			if(num > 0 && num > 100) {
//				if (num == 42) {
//					break;
//				}
//				arrayList.add(num);
//			}
//			
//			Iterator iterator = arrayList.iterator();
//			while(iterator.hasNext()) {
//				System.out.println(iterator.next());
//			}
//		}
		
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in2.nextInt();
		
		
		
		if((num1 == 0 & num2 == 0 )|| (num1 ==1 & num2 == 1))
		{
			System.out.println("NOT PRIME");
				
		}else{
		
		for(int i=num1 ; i<num2; i++){

		   boolean isPrime = true;
			
			for(int j=2; j<i; j++){
			
			if(i%j == 0 )
			{
				//System.out.println( i + " is NOT PRIME");
				isPrime = false;
				break;
			}
			
		}
		if(isPrime){
		System.out.println(i);
			
		}
		
	
				
		}
		}


		
		
		
		
	}
}