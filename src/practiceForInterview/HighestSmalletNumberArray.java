package practiceForInterview;

import java.util.Arrays;

public class HighestSmalletNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[] = {-1,-2,34,3445,32,3432423,32};
		
		int largest = a[0];
		int smallest = a[0];
		
		for(int i =0 ; i<a.length ;i ++) {
			if(a[i]>largest) {
				largest = a[i];
			}
			else if(a[i]<smallest) {
				smallest = a[i];
			}
			
			
			
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println( "largest :: "+largest);
		System.out.println("smallest :: "+smallest);
	}

}
