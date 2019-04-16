package practiceForInterview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find Duplicate elements in array
		
		String names[] = {"Java","c#","Python","Ruby","Java","C++"};
		
		Set<String> duplicates = new HashSet<String>();
		for(String name : names)
		{
			if(duplicates.add(name)==false) {
				System.out.println("Duplicates\n"+ name);
			}
		}
		
		
	}

}
