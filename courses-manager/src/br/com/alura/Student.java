package br.com.alura;

public class Student {

	private String name;
	private int registrationNumber;
	
	public Student(String name, int registrationNumber) {
		if(name == null) {
			throw new NullPointerException("Name cant be null");
		}
		this.name = name;
		this.registrationNumber = registrationNumber;
	}

	public String getName() {
		return name;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student another = (Student) obj;
		return this.name.equals(another.name);
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	@Override
	public String toString() {
		return "[Student: " + this.name + ", registration: " + this.registrationNumber + "]";
	}
	
	
	
}
