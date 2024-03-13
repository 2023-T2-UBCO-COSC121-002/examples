package L17;

public class Node<E> {

	E element;				//the contents
	Node<E> next;			//reference to next node
	
	public Node(E e) {
		this.element = e;
	}
}

