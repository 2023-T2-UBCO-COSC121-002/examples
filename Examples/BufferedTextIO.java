package Examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTextIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File myFile  = new File("textfile.txt");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(myFile));
		
		bw.write("Hi, this is a message\n");   // \n is the escape for newline
		//bw.newLine();
		bw.write("and this is the next line in the message");
		bw.append('A');
		bw.append('B');
		bw.append('C');
		bw.append('\n');
		bw.append('D');
		bw.close();
		
		//Notes:  With the BR, you need a file read
		BufferedReader br = new BufferedReader(new FileReader(myFile));
		String str = null;
		while((str = br.readLine()) != null)
			System.out.println(str);
//		do
//		{
//			str = br.readLine();
//			System.out.println(str);
//		}while(str != null);
		br.close();

	}

}
