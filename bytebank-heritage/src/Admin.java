
public class Admin extends Employee implements Authenticated {

	private Authenticator authenticator;
	
	public Admin() {
		this.authenticator = new Authenticator();
	}
	
	@Override
	public double getBonus() {
		return 50;
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
