package org.coll;
import java.util.LinkedList;
import java.util.List;
//Collection (List)
public class Collection {
public static void main(String[] args) {
		List h=new LinkedList();
		h.add("Nandy");
		h.add("Madhu");
	    h.add('p');
	    h.add(89);
	    h.add(900);
	    h.add("Priya");
	    h.add(32);
	    h.add('n');
//to get the size of the list
	   Object g = h.size();
	 System.out.println(g);  
//To get the specific value from the list
	 Object e = h.get(3);
	System.out.println(e);
//To add the value in the Specific index
	h.add(5,"Gayu");
	System.out.println(h);
//To remove the particular value from the list
	Object u = h.remove(4);
	System.out.println(u);
//To replace the value 
	Object ww = h.set(6,"Prinku");
	System.out.println(ww);
//To get the index position of particular value(first occured)
	int gh = h.indexOf("Nandy");
	System.out.println(gh);
//To get the index position of particular value(last occured)
	int ds = h.lastIndexOf(32);
	System.out.println(ds);
//To check whether the value is present or not
	boolean re = h.contains('p');
	System.out.println(re);
	}
}
