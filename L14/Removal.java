package L14;

import java.util.ArrayList;

public class Removal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("A");
		al.add("B");
		al.add("A");
		
		for (int i = 0; i < al.size(); i++)
		{
			System.out.println("Before: i " + i + " size " + al.size());
			al.remove("A");	
			System.out.println("After: i " + i + " size " + al.size());

		}
		System.out.println(al);
		
	}

}
