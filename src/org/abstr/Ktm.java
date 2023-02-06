package org.abstr;
//sub
public class Ktm extends Bike {
	
@Override
	void cost() {
		System.out.println("Cost");
		
	}
@Override
	 public void speed() {
		System.out.println("Speed:120km/s");
		
	}
public static void main(String[] args) {
	Ktm h=new Ktm();
	h.cost();
	h.speed();
}
}
