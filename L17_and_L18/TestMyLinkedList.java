package L17_and_L18;

import java.util.Iterator;

public class TestMyLinkedList {

	public static void main(String[] args) {
		MyLinkedList<Integer> a = new MyLinkedList<Integer>();
		//fill the list
		for (int i = 0; i < 12; i++) {
			a.add(i);
		}
		displayList(a);

		a.add(3, 17);
		a.addFirst(19);
		a.addLast(21);
		displayList(a);
		
		//remove some elements by index
		a.remove(1);	// remove element at index 1
		a.remove(2);	// remove element at index 2
		a.removeFirst();
		a.removeLast();
		displayList(a);
	}

	public static void displayList(MyLinkedList<Integer> a){
		Iterator<Integer> itr = a.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		System.out.println();			
	}


}
