package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.Client;
import br.com.bytebank.bank.model.SavingsAccount;

public class TestArrayReferences {
	
	public static void main(String[] args) {
		
		//int[] ages = new int[5];
		Object[] reference = new Object[5];
		
		System.out.println(reference.length);
		
		CheckingAccount ca1 = new CheckingAccount(22, 33);
		reference[0] = ca1;
		
		SavingsAccount ca2= new SavingsAccount(55, 66);
		reference[1] = ca2;
		
		Client client = new Client();
		reference[2] = client;
		
		//System.out.println(ca2.getNumber());
		
//		Object GenericReference = accounts[1];
//		
//		System.out.println(GenericReference.getNumber());
		
		SavingsAccount ref = (SavingsAccount) reference[1]; //type cast
		
		System.out.println(ca2.getNumber());
		System.out.println(ref.getNumber());
	}

}
