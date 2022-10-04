
public class TestReferences {

	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.balance = 200;
		System.out.println("Balance of first account: " + firstAccount.balance);
		
		firstAccount.balance += 100;
		System.out.println(firstAccount.balance);
		
		Account secondAccount = firstAccount;
		System.out.println("Balance of second account: " + secondAccount.balance);
		
		firstAccount.agency = 146;
		System.out.println(firstAccount.agency);
		System.out.println(firstAccount.number);
		
		System.out.println(secondAccount.agency);
		
		secondAccount.agency = 146;
		System.out.println("Now the second account is at the agency "
		+ secondAccount.agency);

		if(firstAccount == secondAccount) {
			System.out.println("they are the same account");
		} else {
			System.out.println("they are differents accounts");
		}
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
	}
}
