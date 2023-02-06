package org.abs;

public  class Ktm extends Bike {

	@Override
	public void cost() {
		System.out.println("Ktm Cost Is:1.8L");
	//	super.cost();
	}
	@Override
	void speed() {
		System.out.println("ktm Speed Is:120s");
		
	}
	
	public static void main(String[] args) {
		Ktm d=new Ktm();
		d.cost();
		d.color();
		d.speed();
	}
	
	
	
	
	

}
