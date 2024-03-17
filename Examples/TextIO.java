package Examples;

import java.io.*;
import java.util.Scanner;

public class TextIO {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

			File myFile  = new File("textfile.txt");
			PrintWriter pw = new PrintWriter(myFile);		//file goes in here
			//print - just print - exactly what you give it!
//			pw.print("This");
//			pw.print("is");
//			pw.print("a");
//			pw.print("message");
//			pw.close();
			
			//println
			pw.println("This");
			pw.println("is");
			pw.println("a");
			pw.println("message but the last line is very long!!");
			pw.close();
			System.out.println("Done!");
			
			//let's read the file back in
			Scanner s = new Scanner(myFile);
			while(s.hasNext())
			{
				System.out.println(s.next());
			}
			s.close();

			
			
			
	}

}
