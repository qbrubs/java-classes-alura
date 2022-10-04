package br.com.bytebank.bank.model;

//br.com.bytebank.bank.model.TaxCalculator => FQN

public class TaxCalculator {

	private double totalTax;
	
	public void register(Taxable t) {
		double value = t.getTaxValue();
		this.totalTax += value;
	}
	
	public double getTotalTax() {
		return totalTax;
	}
	
}
