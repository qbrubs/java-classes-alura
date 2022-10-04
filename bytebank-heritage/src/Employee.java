///this is the mother class/base class or super class // is the MAIN
//its abstract, so cant use new employee
public abstract class Employee {
	
	private String name;
	private String documentNumber;
	private double salary;
	
	//method without body
	public abstract double getBonus();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDocumentNumber() {
		return documentNumber;
	}
	
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber ;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
