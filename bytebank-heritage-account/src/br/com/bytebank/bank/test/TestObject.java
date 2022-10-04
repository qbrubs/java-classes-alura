package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.Client;
import br.com.bytebank.bank.model.SavingsAccount;

public class TestObject {
	
	public static void main(String[] args) {
	
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		Object ca = new CheckingAccount(22, 33);
		Object sa = new SavingsAccount(33, 22);
		Object c = new Client();
		
		System.out.println(ca);
		System.out.println(sa);
		
		//println(c);
	}
	
	static void println() {}
	
	static void println(int a) {}
	
	static void println(boolean value) {}

	static void println(Object reference) {
		
	}
}
