package br.com.bytebank.bank.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.Client;
import br.com.bytebank.bank.model.SavingsAccount;

public class Test {

	public static void main(String[] args) {

		Account ca1 = new CheckingAccount(22, 33);
        Client clientCA1 = new Client();
        clientCA1.setName("Nico");
        ca1.setHolder(clientCA1);
        ca1.deposit(333.0);

        Account ca2 = new SavingsAccount(22, 44);
        Client clientCA2 = new Client();
        clientCA2.setName("Guilherme");
        ca2.setHolder(clientCA2);
        ca2.deposit(444.0);

        Account ca3 = new CheckingAccount(22, 11);
        Client clientCA3 = new Client();
        clientCA3.setName("Paulo");
        ca3.setHolder(clientCA3);
        ca3.deposit(111.0);

        Account ca4 = new SavingsAccount(22, 22);
        Client clientCA4 = new Client();
        clientCA4.setName("Ana");
        ca4.setHolder(clientCA4);
        ca4.deposit(222.0);
		
		List<Account> list = new ArrayList<>();
		list.add(ca1);
		list.add(ca2);
		list.add(ca3);
		list.add(ca4);
		
		//Function Object
		list.sort( (a1, a2) -> Integer.compare(a1.getNumber(), a2.getNumber()) ); //lambdas
		
		Comparator<Account> comp = (Account a1, Account a2) -> {
				String nameA1 = a1.getHolder().getName();
				String nameA2 = a2.getHolder().getName();
				return nameA1.compareTo(nameA2);	
		};
		
		list.sort( comp );
			
		list.forEach( (account) -> System.out.println(account + ", " + account.getHolder().getName()) );
		
	}

}