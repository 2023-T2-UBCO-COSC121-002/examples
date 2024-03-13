package L11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serailization {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("object.dat"));)
		{
			oos.writeObject(new A());
		}
	}

}

class A implements Serializable
{
	transient B b = new B();
}

class B{
}
