package Examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BasicBinaryIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = null; //new FileInputStream(new File("textfile.txt"));
		FileOutputStream fos = null; //new FileOutputStream(new File("outfile.txt"));
		
		try {
			fis = new FileInputStream(new File("textfile.txt"));
			fos = new FileOutputStream(new File("outfile.txt"));
			int i = 0;
			while((i = fis.read()) != -1)
			{
				System.out.println(i);
				fos.write(256);
			}
//			System.out.println(fis.read());		// read() reads a byte but returns an int??? why?
//			System.out.println(fis.read());	
//			System.out.println(fis.read());	
//			System.out.println(fis.read());	
//			System.out.println(fis.read());	
//			System.out.println(fis.read());	
//			System.out.println(fis.read());	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			fis.close();
			fos.close();
		}
		
	}

}
