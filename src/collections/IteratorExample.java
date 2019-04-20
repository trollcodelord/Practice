package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iterators support Add and remove operations 
		// hasNext(), next(), remove() 3 methods available in iterator
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i =0 ; i< 20 ; i++)
			al.add(i);
		System.out.println(al);
		
		Iterator<Integer>itr = al.iterator();
		while(itr.hasNext()) {
			int i = (Integer)itr.next();
			
			System.out.print(i + " ");
			
			
			if(i %2 !=0)
				itr.remove();
			}
		
		System.out.println();
		System.out.println(al);
		
		
			
		}
		
		
		
		

	}


