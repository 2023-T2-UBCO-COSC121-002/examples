package L11;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Stuff {

	void print(int n)
	{
		if (n <=5 )
		{
			System.out.println(n);
			print(n+1);
			System.out.println("returning: " + n);
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Stuff s = new Stuff();
		s.print(1);
		
		int x = 1234567890;
		try(PrintWriter out = new PrintWriter("t.txt")){
			out.print(x);
		}


	}

}
