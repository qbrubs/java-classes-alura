package br.com.bytebank.bank.model;

public class CheckingAccount extends Account implements Taxable {

	public CheckingAccount(int agency, int number) {
		super(agency, number);
	}
	
	@Override
	public void withdraw(double value) throws InsufficientBalanceException {
		double valueToWithdraw = value + 0.2;
		super.withdraw(valueToWithdraw);
	}

	@Override
	public void deposit(double value) {
		super.balance += value;
	}

	@Override
	public double getTaxValue() {
		return super.balance * 0.01;
	}
	
	@Override
	public String toString() {
		return "CheckingAccount, " + super.toString();
	}
	
}
