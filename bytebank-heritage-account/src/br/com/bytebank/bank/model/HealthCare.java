package br.com.bytebank.bank.model;

public class HealthCare implements Taxable {

	@Override
	public double getTaxValue() {
		return 42;
	}

}
