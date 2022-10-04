package br.com.alura.bytebank;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;

public class TestLibrary {

	public static void main(String[] args) {
		
		Account c = new CheckingAccount(123, 321);
		
		c.deposit(200.3);

		System.out.println(c.getBalance());
		
	}
	
}
