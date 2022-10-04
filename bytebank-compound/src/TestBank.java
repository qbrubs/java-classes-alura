
public class TestBank {
	
	public static void main(String[] args) {
		Client paulo = new Client();
		paulo.name = "Paulo Silveira";
		paulo.documentNumber = "222.222.222-22";
		paulo.profession = "Programmer";
		
		Account pauloAccount = new Account();
		pauloAccount.deposit(100);
		
		//associate the client Paulo to the pauloAccount
		pauloAccount.holder = paulo;
		System.out.println(pauloAccount.holder.name);
	}
}
