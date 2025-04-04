package Review1;

import java.io.*;

public class BinaryStuff {

	public static void createA() throws IOException
	{
		DataOutputStream out = new DataOutputStream(new FileOutputStream("a.dat",true));
		
		out.writeInt(5);
		out.write(5);
		out.writeChar('B');
		out.writeUTF("B");
		out.close();
		
	}
	
	public static void makeFile() throws IOException
	{
		DataOutputStream out = new DataOutputStream(new FileOutputStream("b.dat"));
		
		for (int i = 225; i < 275; i++)
		{
			out.write(i);
		}
		out.close();
		
	}
	
	public static void readFile(String f) 
	{
		try (DataInputStream in = new DataInputStream(new FileInputStream(f));)
		{
		
		while(in.available() > 0)
			System.out.println(in.read());
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		

	}
	
	public static void readA() throws IOException
	{
		DataInputStream in = new DataInputStream(new FileInputStream("a.dat"));
		
		System.out.print(in.readInt());					//		out.writeInt(5);
		System.out.print(in.read());						//		out.write(5);
		System.out.print(in.readChar());					//		out.writeChar('B');
		System.out.print(in.readUTF());					//		out.writeUTF("B");
		in.close();					//		out.close();
	}
	
	//watch out!! Order of things read must match the order in which they were written to disk!!!!
	public static void readWrongA() throws IOException
	{
		DataInputStream in = new DataInputStream(new FileInputStream("a.dat"));
		
		System.out.print(in.read());						//		out.write(5);
		System.out.print(in.readChar());					//		out.writeChar('B');
		System.out.print(in.readUTF());					//		out.writeUTF("B");
		System.out.print(in.readInt());					//		out.writeInt(5);
		
		in.close();					//		out.close();
	}

	public static void encrypt(File src, int key) throws IllegalArgumentException {
		
		
		if (key < 0 | key > 100) throw new IllegalArgumentException("Invalid key!");
		
		try(FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(src.getName() + ".encr");)
		{
		
		while (in.available() > 0)
		{
			byte input = (byte) (((byte) in.read() + key) % 256); 
			out.write(input);
		}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
	
public static void decrypt(File src, int key) throws IllegalArgumentException {
		
		
		if (key < 0 | key > 100) throw new IllegalArgumentException("Invalid key!");
		
		try(FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(src.getName() + ".decrypt");)
		{
		
		while (in.available() > 0)
		{
			int input = (((int)(byte) in.read()) - key); 
			if (input < 0) input += 256;  //this undoes the wrapping operation
			out.write(input);
		}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			createA();
//			readA();
//			System.out.println();
//			readWrongA();
			
			makeFile();
			readFile("b.dat");
			
			encrypt(new File("b.dat"), 10);
			
			System.out.println("This is the poorly encrypted file");
			readFile("b.dat.encr");
			System.out.println("This is the file after decryption");
			decrypt(new File("b.dat.encr"),10);
			readFile("b.dat.encr.decrypt");

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An exception has occured");
		}
	}

}
