package collections;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

public class AbstractCollectionGFG {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AbstractCollection<Object> abs = new ArrayList<Object>();
		abs.add("Welcome");
		abs.add("To");
		abs.add("%%%%");
		abs.add("1321321");
		abs.add("Height");
		
		System.out.println("AbstractCollection:" + abs);
		System.out.println(abs.contains(abs));
		System.out.println(abs.containsAll(abs));
		System.out.println(abs.isEmpty());
		System.out.println(abs.equals(abs));
		System.out.println(abs.size());
		System.out.println(abs.toArray());
		System.out.println(abs.toString());
		
	Iterator<Object> itr = abs.iterator();
	if(itr.hasNext()) {
		for(Object itrs : abs)
		System.out.println(itrs);
	}
		
	}

}
