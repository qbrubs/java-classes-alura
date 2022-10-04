package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.InsufficientBalanceException;
import br.com.bytebank.bank.model.SavingsAccount;

public class TestAccounts {

	public static void main(String[] args) throws InsufficientBalanceException {
		//Full Qualified Name FQN - package name + simple class name
		
		CheckingAccount ca = new CheckingAccount(111, 111);
		ca.deposit(100.0);
		
		SavingsAccount sa = new SavingsAccount(222, 222);
		sa.deposit(200.0);
		
		ca.transfer(10.0, sa);
		
		System.out.println("Checking account balance is: " + ca.getBalance());
		System.out.println("Savings account balance is: " + sa.getBalance());

	}

}
