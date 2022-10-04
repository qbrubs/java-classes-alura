
public class TestManager {
 
	public static void main(String[] args) {
		
		Manager m1 = new Manager();
		m1.setName("Marco");
		m1.setDocumentNumber("545181533");
		m1.setSalary(5000.0);

		System.out.println(m1.getName());
		System.out.println(m1.getDocumentNumber());
		System.out.println(m1.getSalary());
		
		m1.setPassword(2222);
		boolean authenticated = m1.authenticate(2222);
		System.out.println(authenticated);
		
		System.out.println(m1.getBonus());
	}
}
