package IO_Stuff;

import java.io.*;

public class WriteText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this is where I will look for file!
		
		PrintWriter pr = null;
		String path = "/Users/sfazacke/Documents/files/";
		
		File src = new File(path+"stuff.txt");   //this is going to be the name (and the path) 
		try {
			pr = new PrintWriter(src);
			pr.println("This is now a message going out to my file.....");
		} catch (FileNotFoundException e) {
			System.out.println("This is not the file you are looking for.....");
		}
		finally {
			pr.close();
		}
		
}

}
