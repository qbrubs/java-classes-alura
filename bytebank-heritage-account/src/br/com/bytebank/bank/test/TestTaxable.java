package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.HealthCare;
import br.com.bytebank.bank.model.TaxCalculator;

public class TestTaxable {

	public static void main(String[] args) {
		
		CheckingAccount ca = new CheckingAccount(222, 333);
		ca.deposit(100.0);
		
		HealthCare healthcare = new HealthCare();
		
		TaxCalculator calc = new TaxCalculator();
		calc.register(ca);
		calc.register(healthcare);

		System.out.println(calc.getTotalTax());
	}

}
