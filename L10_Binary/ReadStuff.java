package L10_Binary;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"));
			
			//code here!
//			while (dis.available() > 0)
//			{
//				System.out.println((int)dis.readByte());
//			}
			System.out.println((int)dis.readInt());
			System.out.println((int)dis.readInt());
			System.out.println((int)dis.readInt());
//			System.out.println((int)dis.readInt());
			System.out.println((int)dis.readShort());
			dis.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}