package L16;

import java.util.ArrayList;
import java.util.LinkedList;

public class SmackDown {

	public static void main(String[] args) {
		final int N = 100000;   long startTime, endTime, totalTime;
		//create an ArrayList and a LinkedList of 100,000 elements
		ArrayList<Integer> arraylist = new ArrayList<>(N);
		for (int i = 0; i < N; i++) arraylist.add(i);
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		for (int i = 0; i < N; i++) linkedlist.add(i);

		//get(i) all elements in ArrayList and compute time
		startTime = System.currentTimeMillis();
		for (int i = 0; i < N; i++)
		   //arraylist.get(i);
			arraylist.remove(0);
		endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.printf("ArrayList: get(i) %d elements took %d ms\n",N,totalTime);

		//get(i) all elements in LinkedList and compute time
		startTime = System.currentTimeMillis();
		for (int i = 0; i <N; i++)
		    //linkedlist.get(i);
			linkedlist.remove(0);
		endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.printf("LinkedList: get(i) %d elements took %d ms\n",N,totalTime);


	}

}
