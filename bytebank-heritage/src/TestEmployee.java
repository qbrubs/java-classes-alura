
public class TestEmployee {

	public static void main(String[] args) {
		
		Manager nico = new Manager();
		nico.setName("Nico Steppat");
		nico.setDocumentNumber("452652385-52");
		nico.setSalary(2600.00);
		
		System.out.println(nico.getName());
		System.out.println(nico.getBonus());
	}
	
}
