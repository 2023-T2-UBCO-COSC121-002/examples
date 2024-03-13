package IO_Stuff;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryStuff {

	public static void main(String[] args) {
		
		// this is where I will look for file!
		String path = "/Users/sfazacke/Documents/files/";
		
		File src = new File(path+"stuff.txt");   //this is going to be the name (and the path) 
		try {
			
			
			FileInputStream fis = new FileInputStream(src);
						
			while(fis.available() > 0)  //as long as there are more bytes!
			{
				System.out.println(fis.read());
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);	
		}catch(IOException e)
		{
			System.out.println(e);	

		}
		
		File dest = new File(path+"out.bin");  
		
		try {
			
			
			FileOutputStream fos = new FileOutputStream(dest,true);
			//fos.write("banana");		
//			fos.write('b');
//			fos.write('a');
//			fos.write('n');
//			fos.write('a');
//			fos.write('n');
//			fos.write('a');
			for (int i = 0; i<10; i++)
				fos.write(i);
			
			fos.close();
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);	
		}catch(IOException e)
		{
			System.out.println(e);	

		}
	}

}
