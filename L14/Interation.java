package L14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Interation {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Hi");
		al.add("Cat");
		al.add("Dog");
		al.add("Coffee");
		
		System.out.println("Loops!!");
		for (int i =0; i < al.size(); i++)
			System.out.println(al.get(i));
		
		System.out.println("\nFor-each!!");
		for (String str : al)
			System.out.println(str);
		
		System.out.println("\nIterator!!");
		Iterator<String> it = al.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		it = al.iterator();
		it.next();
		it.remove();//will this work?
		System.out.println(al);
		
		ListIterator<String> li = al.listIterator();
		
		li.next();  //consumes first item
		li.next();	//consume second ite,
		li.remove();   //should remove .... Dog
		
		System.out.println(li.previous());
		li.remove();
		//li.previous();
		
		ArrayList<String> al2 = new ArrayList<>();		//this is empty
		Iterator<String> it2 = al2.iterator();
		
		if (it2.hasNext())
			System.out.println(it2.next());

		


		
	}

}
