package br.com.bytebank.bank.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.Client;

public class SerializationTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Client client = new Client();
		client.setName("Bruna");
		client.setProfession("Dev");
		client.setDocumentNumber("252155620");
		
		CheckingAccount ca = new CheckingAccount(222, 333);
		ca.deposit(222.3);
		ca.setHolder(client);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ca.bin"));
		oos.writeObject(ca);
		oos.close();

	}

}
