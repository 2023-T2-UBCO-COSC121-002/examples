package L13;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
		al.add("one");
		al.add("Two");

		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
		System.out.println(al.get(0));
		
		System.out.println(al);
		
		//Watch out !!!! 
		//al.add(4,"Three");
		
		al.add(null);
		al.add(null);
		al.add("Three");
		al.add("one");
		al.add("one");

		al.add("one");

		al.add("one");

		al.add("one");

		al.add("one");

		System.out.println(al);
		
		al.remove(1);
		
		System.out.println(al);
		
		al.remove("one");
		System.out.println(al);
		System.out.println(al[0]);

		
//		
//		al.clear();
//
//		al.add(null);
//		
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
//		al.remove(0);
//		System.out.println(al.size());
//		System.out.println(al.isEmpty());

		
		
		

	}

}
