package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		
		//ListIterator is not universal because it is used only for element of list 
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i =0; i<10 ;i ++)
		al.add(i);
		
		System.out.println(al);
		
		
		ListIterator<Integer> l =  al.listIterator();
		
		while(l.hasNext()) {
			
			
			int i = (Integer)l.next();
			
		//	System.out.println(i + " ");
			
			if(i%2 == 0) {
				i++;
				l.set(i);
				System.out.println(l.next());
				System.out.println(l.previous());
				l.add(i);
				System.out.println(l.next());
				System.out.println(l.previous());
			}
			
			System.out.println();
			System.out.println(al);
			
		}
			
		
		
		

	}

}
