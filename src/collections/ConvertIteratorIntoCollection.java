package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ConvertIteratorIntoCollection {

	
	public static <Y>Collection<Y> getcollectionfromIterator(Iterable<Y> itr) {
		
		
		Collection<Y> clnAry = new ArrayList<Y>();
		
//		for(Y y : itr)
//			clnAry.add(y);
//		
//		return clnAry;
		
		return StreamSupport.stream(itr.spliterator(), false).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Iterable<Integer> i = Arrays.asList(2,3,4,5);
			System.out.println("Iterable : "  +i);
			
			Collection<Integer> cn = getcollectionfromIterator(i);
			System.out.println("Collection " +cn);

	}

}
