
public class ControlBonus {

	private double sum;
	
	public void register(Employee e) { //generic reference
		double b = e.getBonus();
		this.sum = this.sum + b;
	}
	
	public double getSum() {
		return sum;
	}
	
}
