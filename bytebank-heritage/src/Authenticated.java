//contract Authenticated 
	//who sign this contract needs to implement:
		//method setPassword
		//method authenticate
public abstract interface Authenticated {
	
	public abstract void setPassword(int password);
	
	public abstract boolean authenticate(int password);

}
