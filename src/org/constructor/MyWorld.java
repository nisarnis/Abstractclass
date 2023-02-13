package org.constructor;
//Constructors
public class MyWorld {
public MyWorld(String name) {
	
System.out.println("Im:"+name);
}
public MyWorld(int phn) {
	this();
	System.out.println("Your Phnno:"+phn);
}
public MyWorld() {
	this(94,"Rajiv Nagar");
	System.out.println("hi");
}
public MyWorld(int pin,String add ) {
	this("Nisar");
	System.out.println("ur pin:"+pin+"\n Ur address:"+add);
}


	
}


