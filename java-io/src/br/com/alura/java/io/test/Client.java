package br.com.alura.java.io.test;

import java.io.Serializable;

/**
 * Class that represents a Bytebank client.
 * 
 * @author Bruna Nascimento
 * @version 0.1
 * 
 */

public class Client implements Serializable {
	
	private static final long serialVersionUID = 1L; //Id of the class
	private String name;
	private String documentNumber;
	private String profession;
	
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
		this.documentNumber = documentNumber;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
}
