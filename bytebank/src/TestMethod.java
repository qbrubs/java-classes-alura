
public class TestMethod {

	public static void main(String[] args) {
		Account accountOfPaulo = new Account();
		accountOfPaulo.balance = 100;
		accountOfPaulo.deposit(50);
		System.out.println(accountOfPaulo.balance);
		
		boolean itWorked = accountOfPaulo.withdraw(20);
		System.out.println(accountOfPaulo.balance);
		System.out.println(itWorked);
		
		Account accountOfMarcela = new Account();
		accountOfMarcela.deposit(1000);
		
		boolean transferSucceed = accountOfMarcela.transfer(300, accountOfPaulo);
		if(transferSucceed) {
			System.out.println("The transfer was succeed");
		} else {
			System.out.println("You don't have enough money");
		}
		
		System.out.println(accountOfMarcela.balance);
		System.out.println(accountOfPaulo.balance);
		
		accountOfPaulo.holder = "Paulo Silveira";
		System.out.println(accountOfPaulo.holder);
	}
}
