package L14;

import java.util.ArrayList;
import java.util.Iterator;

public class It2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<String> al = new ArrayList<>();
		
		al.add("Hi");
		al.add("Cat");
		al.add("Dog");
		al.add("Coffee");
		
		Iterator<String> it = al.iterator();
		Iterator<String> it2 = al.iterator();
		
		it.next();
		//it.remove();
		System.out.println(it2.next());


	}

}
