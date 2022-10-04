package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.AccountsKeeper;

public class TestAccountsKeeper {

	public static void main(String[] args) {
		
		AccountsKeeper keeper = new AccountsKeeper();
		
		Account ca = new CheckingAccount(22, 11);
		keeper.add(ca);
		
		Account ca2 = new CheckingAccount(22, 22);
		keeper.add(ca2);
		
		int size = keeper.getElementsQuantity();
		System.out.println(size);
		
		Account ref = keeper.getReference(1);
		System.out.println(ref.getNumber());

	}

}
