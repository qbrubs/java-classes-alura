package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Course {

	private String name;
	private String instructor;
	private List<Class> classes = new LinkedList<Class>();
	private Set<Student> students = new HashSet<>();
	private Map<Integer, Student> registrationToStudent = new HashMap<>();

	public Course(String name, String instructor) {
		this.name = name;
		this.instructor = instructor;
	}

	public String getName() {
		return name;
	}

	public String getInstructor() {
		return instructor;
	}

	public List<Class> getClasses() {
		return Collections.unmodifiableList(classes);
	}
	
	public void add(Class newClass) {
		this.classes.add(newClass);
	}
	
	public int getTotalTime() {
//		int totalTime = 0;
//		for (Class classTime : classes) {
//			totalTime += classTime.getTime();
//		}
//		return totalTime;
		return this.classes.stream().mapToInt(Class::getTime).sum();
	}
	
	@Override
	public String toString() {
		return "[Course: " + name + ", total time: " + this.getTotalTime() + ". Classes: " + this.classes + "]";
	}

	public void register(Student student) {
		this.students.add(student);
		this.registrationToStudent.put(student.getRegistrationNumber(), student);
	}
	
	public Set<Student> getStudents() {
		return Collections.unmodifiableSet(students);
	}

	public boolean isRegistered(Student student) {
		return this.students.contains(student);
	}

	public Student searchRegistration(int number) {
//		if(registrationToStudent.containsKey(number))
//			throw new NoSuchElementException();
		return registrationToStudent.get(number);
	}

}
