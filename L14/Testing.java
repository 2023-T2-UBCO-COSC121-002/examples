package L14;

import java.util.ArrayList;
import java.util.Iterator;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int N = 2000000; //try other values
		//create an arraylist initialized to random chars then "a"s
		ArrayList<String> list1 =  new ArrayList<>(N);
		for(int i = 0; i<N; i++)
			if(i<N/2) list1.add((char)(Math.random()*25+'b')+""); //random characters
			else      list1.add("a");
		//create a second arraylist identical to list1
		ArrayList<String> list2=(ArrayList<String>)list1.clone(); 

		//***Remove all "a"s and measure the time ***

		//method 1: using contains()
		long start = System.currentTimeMillis();
		while(list1.contains("a"))	//search for a			
			list1.remove("a");			//search for a, then remove a
		long end = System.currentTimeMillis();
		System.out.printf("Method 1 Time: %d ms\n",(end-start));

		//method 2: using an iterator
		start = System.currentTimeMillis();
		Iterator<String> it = list2.iterator();	
		while(it.hasNext()) 
			if(it.next().equals("a"))
				it.remove();	//remove a
		end = System.currentTimeMillis();
		System.out.printf("Method 2 Time: %d ms\n", (end-start));

	}

}
