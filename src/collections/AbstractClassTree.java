package collections;

import java.util.TreeSet;
import java.util.AbstractCollection;

public class AbstractClassTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AbstractCollection<Object> abs1 = new TreeSet<Object>();
		abs1.add("Practice");
		abs1.add("Collection");
		abs1.add("4");
		abs1.add("FUN *&&^");
		
		System.out.println(abs1);
		
		AbstractCollection<Object> abs2 = new TreeSet<Object>();
		
		abs2.addAll(abs1);
		
		System.out.println(abs2);
	}

}
