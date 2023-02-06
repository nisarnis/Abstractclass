package org.methodoverrid;

public class AxisBank extends BankInfo {
	@Override
		public void saving() {
			System.out.println("Saving:3%");
			super.saving();
		}
	@Override
	public void deposit() {
	System.out.println("Deposit:6%");
		super.deposit();
	}
	@Override
	public void fixed() {
	System.out.println("Fixed:4%");
		super.fixed();
	}
	
	
public static void main(String[] args) {
	AxisBank f=new AxisBank();
	f.deposit();
	f.saving();
	f.fixed();
}
}
