package L07;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Ex.divide(10,0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("I'm catching " + e);
		}
		System.out.println("The end");
	}
	
	public static void divide (int n1, int n2)
	{
		try
		{
			System.out.println(n1/n2);
		}
		catch (NullPointerException e)
		{
			System.out.println(e);
		}
		catch (ArithmeticException e)
		{
			System.out.println("I'm catching the inner" + e.getStackTrace());
		}
		finally
		{
			System.out.println("I'm finally done with this");
		}
		
		System.out.println("This is other code...");		
	}

}
