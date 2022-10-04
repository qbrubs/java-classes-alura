package br.com.bytebank.bank.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.bank.model.CheckingAccount;

public class DeserializationTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ca.bin"));
		CheckingAccount ca = (CheckingAccount) ois.readObject();
		ois.close();
		System.out.println(ca.getBalance());
		System.out.println(ca.getHolder());

	}

}
