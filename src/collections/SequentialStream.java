package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SequentialStream {
	
	
	public static <T>Stream<T> iteratortoSequentialStream(Iterator<T> itr){
		
		Spliterator<T> spilt = Spliterators.spliteratorUnknownSize(itr, Spliterator.NONNULL);
		return StreamSupport.stream(spilt, false);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Iterator<String> itr = Arrays.asList("G","E","E","K","S").iterator();

Stream<String> stream = iteratortoSequentialStream(itr);
System.out.println(stream.collect(Collectors.toList()));

		
	}

}
