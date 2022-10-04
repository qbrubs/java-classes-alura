
public class CreateAccount {
	
	public static void main(String[] args) {
		Account firstAccount = new Account(); 
		firstAccount.balance = 200;
		System.out.println(firstAccount.balance);
		
		firstAccount.balance += 100;
		System.out.println(firstAccount.balance);
		
		Account secondAccount = new Account();
		secondAccount.balance = 400;
		
		System.out.println("The first account have " + firstAccount.balance + " of balance");
		System.out.println("The second account have " + secondAccount.balance + " of balance");
	
		System.out.println(firstAccount.agency);
		
	}
}
