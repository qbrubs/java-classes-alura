//Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
public class TestReferences {

	public static void main(String[] args) {
		
		Manager m1 = new Manager();
		m1.setName("Marcos");
		m1.setSalary(5000.0);
		
		Designer d = new Designer();
		d.setSalary(2000.0);
		
		VideoEditor v = new VideoEditor();
		v.setSalary(2500.0);
		
		ControlBonus control = new ControlBonus();
		control.register(m1);
		control.register(d);
		control.register(v);
		
		System.out.println(control.getSum());
	}

}
