package br.com.bytebank.bank.model;

public class AccountsKeeper {

	private Account[] references;
	
	private int freePosition;
	
	public AccountsKeeper() {
		this.references = new Account[10];
		this.freePosition = 0;
	}
	
	public void add(Account ref) {
		this.references[this.freePosition] = ref;
		this.freePosition++;
	}

	public int getElementsQuantity() {
		return this.freePosition;
	}

	public Account getReference(int pos) {
		return this.references[pos];
	}
	
}
