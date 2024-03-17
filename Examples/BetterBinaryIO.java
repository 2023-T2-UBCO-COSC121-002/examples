package Examples;

import java.io.*;

public class BetterBinaryIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DataOutputStream dos = new DataOutputStream(new FileOutputStream("out1.dat"));
		
		try {
			dos.writeInt(123);    //writes 4 bytes
			dos.writeShort(55);	//writes 2 bytes
			dos.writeUTF("hi bob!");		//writes the length of the String as ASCII bytes + 2 bytes for length
			dos.writeChar('H');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("out1.dat"));
		
		System.out.println(dis.readInt());
		System.out.println(dis.readShort());
		System.out.println(dis.readUTF());
		System.out.println(dis.readChar());
		
		
		//Don't mix up the order!!!
//		System.out.println(dis.readShort());
//		System.out.println(dis.readInt());
//		System.out.println(dis.readChar());
//		System.out.println(dis.readUTF());

		dis.close();
		//		System.out.println("The data in the binary file ....");
//		
//		FileInputStream fis = new FileInputStream(new File("out1.dat"));
//		int i = 0;
//		while((i = fis.read()) != -1)
//		{
//			System.out.println(i);
//		}
//		
	}

}
