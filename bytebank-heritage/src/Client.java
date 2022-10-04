
public class Client implements Authenticated {
	
	private Authenticator authenticator;
	
	public Client() {
		this.authenticator = new Authenticator();
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
