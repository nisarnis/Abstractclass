package org.constructor;
//Constructor (child)
public class World extends MyWorld {
public World() {
	this(55.3f);
	System.out.println("helo");
}
public World(String city,int pin) {
	super(84983);
	System.out.println("City:"+city+"\npincode"+pin);
}
public World(float weight) {
	this("Trichy",600097);
	System.out.println("ur weight:"+weight);
}

public static void main(String[] args) {
	World n=new World();
	
}

}
