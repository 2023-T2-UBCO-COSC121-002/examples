package L06;

public interface Edible {
	public abstract String howToEat();  //You need 
	
	public default void spoil() {
		System.out.println("Food is bad!");
	}
	
	public static void printHi() {
		System.out.println("HI");
	}
}
