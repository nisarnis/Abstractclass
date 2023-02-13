package org.coll;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//Collection(Set)
public class SetClass {
public static void main(String[] args) {
Set h=new LinkedHashSet();
h.add(2);
h.add('r');
h.add("Nisar");
h.add(72);
h.add("Ishaan");
h.add("Priya");
System.out.println(h);
//Contains-to check whether the value is contain r not
boolean contains = h.contains(72);
System.out.println(contains);
//Remove-to remove the Particular value
h.remove("Ishaan");
System.out.println(h);
//add all-to add all the values
Set t=new HashSet();
t.add("duck");
t.add(2);
t.add('r');
System.out.println(t);
h.addAll(t);
	System.out.println(h);
//remove all-to remove the common values
h.removeAll(t);
	System.out.println(h);
//retain all-to retain the common values
	h.retainAll(t);
System.out.println(h);
	}	
}	


