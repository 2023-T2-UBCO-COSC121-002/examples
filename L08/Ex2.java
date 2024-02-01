package L08;

public class Ex2 {
	public static void main(String[] args) {
	     try {
		   int[] list = new int[10];
		   System.out.println(list[10]);
	     } catch (ArithmeticException ex) {
		   System.out.println("Arithmetic");
	     } catch (RuntimeException ex) {
		   System.out.println("Runtime");
	     } catch (Exception ex) {
		   System.out.println("Exception");
	     }
	}
}
