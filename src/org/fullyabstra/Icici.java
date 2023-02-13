package org.fullyabstra;
//child(fully abstraction)
public class Icici implements Hdfc,WorldBank {

	@Override
	public void saving() {
		System.out.println("Savimng:7%");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit:9%");
		
	}

	@Override
	public void fixed() {
		System.out.println("Fixed:3%");
		
	}

	@Override
	public void loan() {
		System.out.println("Loan:5%");
		
	}
	public static void main(String[] args) {
		Icici y=new Icici();
		y.deposit();
		y.fixed();
		y.saving();
	}
	
	

}
