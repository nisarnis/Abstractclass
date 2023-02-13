package org.typesofvariables;
//Child Instance Variable(object level)
public class ChildInstance extends Instance {
	String jack;
public static void main(String[] args) {
	ChildInstance l=new ChildInstance();
	System.out.println(l.jack);
	
//without Extends
	Instance t=new Instance();
	System.out.println(t.height);
	
//with extends
	System.out.println(l.height);

	
}	

}
