
public class TestGetandSet {
	
	public static void main(String[] args) {
		Account account = new Account(1337, 24226);
		System.out.println(account.getNumber());
		
		Client paulo = new Client();
		paulo.setName("Paulo Silveira");
		paulo.setDocumentNumber("222.222.222-22");
		paulo.setProfession("Programmer");
		account.setHolder(paulo);
		
		System.out.println(account.getHolder().getName());
		
		account.getHolder().setProfession("Programmer");
		Client accountHolder = account.getHolder();
		accountHolder.setProfession("Programmer");
		
		System.out.println(accountHolder);
		System.out.println(paulo);
		System.out.println(account.getHolder());
	}
}
