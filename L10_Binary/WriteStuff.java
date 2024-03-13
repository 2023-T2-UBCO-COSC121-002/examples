package L10_Binary;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"));
			
			dos.writeShort(16);
			dos.writeInt(16);
			dos.writeChar('A');
			dos.writeUTF("this");
			dos.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
