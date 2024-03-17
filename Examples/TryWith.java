package Examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWith {

	public static void main(String[] args) throws FileNotFoundException {
		File myFile  = new File("textfile.txt");
		File myFile2 = new File("testfile2.txt");
		try (PrintWriter pw = new PrintWriter(myFile); Scanner s = new Scanner(myFile);)
		{
			while(s.hasNext())
			{
				pw.write(s.next());
			}
//			pw.write("this is a message\n");
//			pw.write("and this is line 2\n");
//			pw.flush();
		}
	}

}
