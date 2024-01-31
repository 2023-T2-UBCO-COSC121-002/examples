package L02;

public class Bob {

	public void printBob() {
		//System.out.println("Bob is an empty object");
		System.out.println(this.toString());
	}
	
	public void printSuperBob() {
		//System.out.println("Bob is an empty object");
		System.out.println(super.toString());
	}
	
	
	public String toString()
	{
		return "This is bob!";
	}
}
