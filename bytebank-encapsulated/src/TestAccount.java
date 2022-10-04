
public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account(1337, 23334);
		
		account.deposit(200.0);
		
		System.out.println(account.getBalance());
		
		account.setAgency(570);
		
		System.out.println(account.getAgency());
		
		System.out.println("The number of accounts is: " + Account.getTotal());
	}
}
