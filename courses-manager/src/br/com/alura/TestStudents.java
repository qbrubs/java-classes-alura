package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestStudents {

	public static void main(String[] args) {
		
		Set<String> students = new HashSet<>();
		
		students.add("Sergio Lopes");
		students.add("Rodrigo Turini");
		students.add("Alberto Souza");
		students.add("Nico Steppat");
		students.add("Renan Saggio");
		students.add("Mauricio Aniche");
		
		boolean pauloIsRegistered = students.contains("Paulo Silveira"); //its very fast when we working with sets 
		students.remove("Sergio Lopes"); //its very fast when we working with sets 
		System.out.println(pauloIsRegistered);
		
		System.out.println(students.size());
		
		for (String student : students) {
			System.out.println(student);
		}
		
		students.forEach(student -> {
			System.out.println(students);
		});
		
		System.out.println(students);

	}

}
