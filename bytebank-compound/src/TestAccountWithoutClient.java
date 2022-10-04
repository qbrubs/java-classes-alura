
public class TestAccountWithoutClient {
	
	public static void main(String[] args) {
		Account marcelaAccount = new Account();
		
		marcelaAccount.holder = new Client();
		System.out.println(marcelaAccount.holder);
		
		marcelaAccount.holder.name = "Marcela";
		System.out.println(marcelaAccount.holder.name);
	}
}
