public class Account {
	private double balance;
	private int agency;
	private int number;
	private Client holder;
	private static int total = 0;
	
	public Account(int agency, int number) {
		Account.total++;
		//System.out.println("The number of account is " + Account.total);
		
		this.agency = agency;
		this.number = number;
		//System.out.println("I am creating a new account " + this.number);
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public boolean withdraw(double value) {
		if(this.balance >= value) {
			this.balance -= value;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfer(double value, Account destiny) {
		if(this.balance >= value) {
			this.balance -= value;
			destiny.deposit(value);
			return true;
		} else {
			return false;
		}
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
	
}