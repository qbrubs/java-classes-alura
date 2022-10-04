
public class TestValue {

	public static void main(String[] args) {
		Account account = new Account(1337, 24226);
		
		System.out.println(account.getAgency());
		
		Account account2 = new Account(1337, 16549);
		Account account3 = new Account(1526, 16589);
		
		System.out.println(Account.getTotal());
	}
	
}
