//Manager is also a employee //daughter class //inherits the main class - employee/ sign authenticated contract
//its forbidden double heritage in java, but you can have more than one interface
public class Manager extends Employee implements Authenticated {
	
	private Authenticator authenticator;
	
	public Manager() {
		this.authenticator = new Authenticator();
	}
	 
	public double getBonus() {
		System.out.println("Calling the bonus method of the manager");
		return super.getSalary();
	}

	@Override
	public void setPassword(int password) {
		this.authenticator.setPassword(password);
	}

	@Override
	public boolean authenticate(int password)  {
		return this.authenticator.authenticate(password);
	}
		
}

