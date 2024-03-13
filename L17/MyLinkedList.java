package L17;

public class MyLinkedList<E> {

	int size = 0;
	Node<E> head =null;
	Node<E> tail =null;
	
	public void addFirst(E e)
	{
		//is the list empty
		if (size == 0)  // if (head == null)
		{
			head = tail = new Node(e);
		}
		//
	}
}
