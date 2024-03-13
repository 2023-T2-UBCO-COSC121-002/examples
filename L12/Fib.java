package L12;

public class Fib {
	
	static int counter = 0;

	//it works but YUK!
	public static long fib(long n)
	{
		//System.out.println("Computing fib of " + n);
		counter ++;
		//case  0
		if (n == 0) return 0;
		//case 1
		else if (n == 1) return 1;
		else return fib(n-1) + fib(n-2);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("fibnum: " + fib(32));
		System.out.println("Number of calls: " + counter);
	}

}
