package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.InsufficientBalanceException;

public class TestWithdraw {

	public static void main(String[] args) {
		Account account = new CheckingAccount(123, 321);
		
		account.deposit(200.0);
		try {
			account.withdraw(210.0);
		} catch(InsufficientBalanceException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println(account.getBalance());
	}
	
}
