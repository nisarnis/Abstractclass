package org.coll;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Collection(Map)
public class Two {
public static void main(String[] args) {
	Map<Integer,String> i=new HashMap();
	i.put(54,"Moni");
	i.put(23,"Jack");
	i.put(27,"32");
	i.put(97,"w");
	i.put(783,"Nisar");
	i.put(2,"Jack");
	System.out.println(i);
//Size-To Get the Size of the Map
	int u = i.size();
	System.out.println(u);
//put-to put(add) the value
	i.put(4,"fathi");
	System.out.println(i);
//Contain(key)-to check whether the key contain r not
	boolean w = i.containsKey(27);
	System.out.println(w);
//Contain(value)-to check whether the value contain r not
	boolean cv = i.containsValue("Jack");
	System.out.println(cv);
//get(key)-to get the value based on the key
	String g = i.get(2);
	System.out.println(g);
//keyset-to get the set of key
Set<Integer> ks = i.keySet();
	System.out.println(ks);
//value-to get collection of value
	Collection<String> v= i.values();
	System.out.println(v);
//get(key)-to get the value based on the key
   String re = i.get(783);
   System.out.println(re);
}

}
