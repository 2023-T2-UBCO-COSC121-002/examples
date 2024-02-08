package IO_Stuff;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Text {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		//Start with reading a file (text-base file)
		Scanner in = null;
		
		// this is where I will look for file!
		String path = "/Users/sfazacke/Documents/files/";
		
		File src = new File(path+"stuff.txt");   //this is going to be the name (and the path) 
		try {
			in = new Scanner(src);
			
			
			while(in.hasNext())
			{
				//System.out.println(in.nextLine());
				try {
					System.out.println("Int: " + in.nextInt());
				}
				catch(InputMismatchException e)
				{
					System.out.print("You've tried to read the wrong type! ");
					System.out.println(in.next());

				}
			}
		}
		catch(FileNotFoundException  e)
		{
			System.out.println("This is not the file you are looking for.....");
		}
		finally {
			in.close();
		}
	}

}
