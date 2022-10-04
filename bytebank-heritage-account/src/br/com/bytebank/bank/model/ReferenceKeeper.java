package br.com.bytebank.bank.model;

public class ReferenceKeeper {

	private Object[] references;
	private int freePosition;
	
	public ReferenceKeeper() {
		this.references = new Object[10];
		this.freePosition = 0;
	}
	
	public void add(Object ref) {
		this.references[this.freePosition] = ref;
		this.freePosition++;
	}
	
	public int getElementsQuantity() {
		return this.freePosition;
	}
	
	public Object getReferences(int pos) {
		return this.references[pos];
	}
	
}
