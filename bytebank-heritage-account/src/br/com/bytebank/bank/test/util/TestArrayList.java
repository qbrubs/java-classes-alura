package br.com.bytebank.bank.test.util;

import java.util.ArrayList;
import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;

public class TestArrayList {

	public static void main(String[] args) {
		
		//generics <> only guards string type references
		ArrayList<Account> list = new ArrayList<Account>();
		
		Account ca = new CheckingAccount(22, 11);
		list.add(ca);
		
		Account ca2 = new CheckingAccount(22, 22);
		list.add(ca2);
		
		System.out.println("Size: " + list.size());
		Account ref = list.get(0);
		System.out.println(ref.getNumber());
		
		list.remove(0);
		System.out.println("Size: " + list.size());
		
		Account ca3 = new CheckingAccount(33, 311);
		list.add(ca3);
		
		Account ca4 = new CheckingAccount(33, 322);
		list.add(ca4);
		
		for(int i = 0; i < list.size(); i++) {
			Object aRef = list.get(i);
			System.out.println(aRef);
		}
		
		System.out.println("-----------------------------------------------");
		
		for(Account account: list) {
			System.out.println(account);
		}
		
		

	}

}
