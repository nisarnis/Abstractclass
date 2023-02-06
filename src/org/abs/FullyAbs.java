package org.abs;

public class FullyAbs implements Bank,RbiBank{
	
	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("65%");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("5%");
	}

	@Override
	public void saving() {
		// TODO Auto-generated method stub
		System.out.println("15%");
	}
	public static void main(String[] args) {
		FullyAbs g=new FullyAbs();
		g.saving();
		g.deposit();
	}

}
