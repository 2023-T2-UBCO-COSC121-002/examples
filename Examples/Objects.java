package Examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Objects {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stuff.dat"));
		
		Dog d = new Dog();
		System.out.println(d.c.name);
		
		oos.writeObject(d);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stuff.dat"));
		
		Dog betterD = null;
	
		betterD = (Dog)ois.readObject();
		
		System.out.println(betterD);
		System.out.println(betterD.c.name);

		ois.close();
	}

}

class Dog implements Serializable{
	String name = "Geo";
	transient Cat c = new Cat();
	
	public String toString() {
		return name;
	}
}

class Cat{
	String name = "Ralph";
}