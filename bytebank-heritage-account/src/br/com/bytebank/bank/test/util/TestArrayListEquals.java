package br.com.bytebank.bank.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;

public class TestArrayListEquals {

	public static void main(String[] args) {
		
//		Account ca = new CheckingAccount(22, 11);
//		Account ca2 = new CheckingAccount(22, 22);
//		
//		boolean equal = ca.itsEqual(ca2);
//		System.out.println(equal);
		
		//The LinkedList is a doubly "linked" list and 
		//the ArrayList represents an array with dynamic resizing.
		
		//Generics <> only guards string type references
		List<Account> list = new ArrayList<Account>(); //Vector -- threadsafe
		
		Account ca = new CheckingAccount(22, 11);
		list.add(ca);
		
		Account ca2 = new CheckingAccount(22, 22);
		list.add(ca2);
		
		Account ca3 = new CheckingAccount(22, 22);
//		list.add(ca3);
		boolean exist = list.contains(ca3);
		System.out.println("Already exists? " + exist);
		
//		for(Account account: list) {
//			if(account.itsEqual(ca3)) {
//				System.out.println("I already have this reference");
//			}
//		}
		
		for(Account account: list) {
			System.out.println(account);
		}
		
		//java.util.Collection -- Mother interface of all java util collection 
		//in the collection we have the two daughter java.util.List and java.util.Set

	}

}
