package br.com.bytebank.bank.model;

import java.io.Serializable;

/**
 * Main class that represents the account model of a bank
 * @author Bruna Nascimento
 * @version 0.1
 */

//abstract cannot be instantiated but can have attributes
public abstract class Account extends Object implements Comparable<Account>, Serializable { //comparable -- natural order
	
	protected double balance;
	private int agency;
	private int number;
	private transient Client holder; //this will not be saved in the object
	private static int total = 0;
	
	public Account() {
		
	}
	
	public Account(int agency, int number) {
		Account.total++;
		//System.out.println("The number of account is " + Account.total);
		this.agency = agency;
		this.number = number;
		//this.balance = 100;
		//System.out.println("I am creating a new account " + this.number);
	}
	
	public abstract void deposit(double value);
	
	public void withdraw(double value) throws InsufficientBalanceException {

		if(this.balance < value) {
			throw new InsufficientBalanceException("Balance: " + this.balance + ", Value: " + value);
		} 
		
		this.balance -= value;
	}
	
	public void transfer(double value, Account destiny) throws InsufficientBalanceException {
		this.withdraw(value); 
		destiny.deposit(value);
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		this.number = number;
		if(number <= 0) {
			System.out.println("Its forbidden a value less or equal to 0");
			return;
		}
		this.number = number;
	}
	
	public int getAgency() {
		return this.agency;
	}
	
	public void setAgency(int agency) {
		if(agency <= 0) {
			System.out.println("Its forbidden a value less or equal to 0");
			return;
		}
		this.agency = agency;
	}
	
	public Client getHolder() {
		return holder;
	}
	
	public void setHolder(Client holder) {
		this.holder = holder;
	}
	
	public static int getTotal() {
		return Account.total;
	}
	
	@Override
	public boolean equals(Object ref) {
		Account another = (Account) ref; 
		
			if(this.agency != another.agency) {
				return false;
			}
			
			if(this.number != another.number) {
				return false;
			}
			
			return true;
	}
	
	@Override
	public int compareTo(Account another) {
		return Double.compare(this.balance, another.balance);
	}
	
	@Override
	public String toString() {
		return "Number: " + this.number + ", Agency: " + this.agency + ", Balance: " + this.balance;
	}
	
}