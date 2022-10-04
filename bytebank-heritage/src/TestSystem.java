
public class TestSystem {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.setPassword(2222);
		
		Admin adm = new Admin();
		adm.setPassword(3333);
		
		Client c = new Client();
		c.setPassword(2222);
		
		InternSystem is = new InternSystem();
		is.authenticate(m);
		is.authenticate(adm);
		is.authenticate(c);

	}
}
