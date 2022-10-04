
public class InternSystem {

	private int password = 2222;
	
	public void authenticate(Authenticated ae) {
		boolean authenticated = ae.authenticate(this.password);
		if(authenticated) {
			System.out.println("You can enter in the system");
		} else {
			System.out.println("You cannot enter in the system");
		}
	}
	
}
