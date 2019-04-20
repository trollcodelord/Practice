package collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//We can create Enumeration by calling elements() method of vector on any vector object.
		// Only use for legacy classes example : Vector, Stack , properties , hashtable etc
		//remove operation not allowed
		//hasMoreElements and nextElement method available
		// only forward type cursor
		
		Vector v = new Vector();
		for(int i=0; i<10; i++)
		v.addElement(i);
		System.out.println(v);
		
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			
			int i = (Integer)e.nextElement();
			System.out.print(i +" ");
		}
		
		
		

	}

}
