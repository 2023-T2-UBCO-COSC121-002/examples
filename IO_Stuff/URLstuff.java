package IO_Stuff;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.net.URL;

public class URLstuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Start with reading a file (text-base file)
		Scanner in = null;
		
		// this is where I will look for file!
		URL url = null;
		
		try {
			url = new URL("https://www.google.ca/index.html");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("Bad URL");
		}
		
		//File src = new File(path+"stuff.txt");   //this is going to be the name (and the path) 
		try {
			in = new Scanner(url.openStream());
			
			while(in.hasNextLine())
			{
				
					System.out.println(in.nextLine());
			}
		}
		catch(FileNotFoundException  e)
		{
			System.out.println("This is not the file you are looking for.....");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			in.close();
		}
	}

}
