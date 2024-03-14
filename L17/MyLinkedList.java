package L17;

import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E> {

	int size = 0;
	
	Node<E> head =null;
	Node<E> tail =null;
	
	public void addLast(E e)
	{
		if (size == 0)  // if (head == null)
		{
			head = tail = new Node<E>(e);
		}
		else
		{
			Node<E> newNode = new Node<>(e);
			newNode.next = null;  //do this first
			tail.next = newNode;
			tail = tail.next;
		}
		size ++;			//Don't forget this!!
	}
	
	public void addFirst(E e)
	{
		//is the list empty
		if (size == 0)  // if (head == null)
		{
			head = tail = new Node<E>(e);
		}
		else 
		{
			Node<E> newNode = new Node<>(e);
			newNode.next = head;  //do this first
			head = newNode;
		}
		size ++;
	}
	@Override
	public void add(E e) {	
		this.addLast(e);
	}
	@Override
	public void add(int idx, E e) {
		
		if (idx < 0 || idx > this.size)  //check if index is OOB
		{
			throw new IndexOutOfBoundsException();
		}
		else
		{
			if (idx == 0)  this.addFirst(e);			//first
			else if (idx == this.size) this.addLast(e);	//end
			else
			{
				Node<E> newNode = new Node<>(e);		//the new node
				Node<E> previous = head;
				for (int i = 0; i < idx - 1; i++)		//becareful with logic!
				{
					previous = previous.next;
				}
				newNode.next = previous.next;			//order matters!
				previous.next = newNode;
				size++;
			}
		}
		
		
	}
	
	public E removeFirst()
	{
		if (size == 0)
			return null;
		else
		{
			size--;
			Node<E> temp = head;		//order matters!!
			head = head.next;	
			if (size == 0) tail = null;
			return temp.element;
		}
//		else if (size == 1)
//		{
//			size--;
//			Node<E> temp = head;		//order matters!!
//			head = tail = null;
//			return temp.element;
//		}
//		else
//		{
//			size--;
//			Node<E> temp = head;		//order matters!!
//			head = head.next;			
//			return temp.element;
//		}
//		
			
	}
	
	public E removeLast() {
		if (size == 0)
			return null;
		else if (size == 1)				//single element list
		{
			size--;
			Node<E> temp = tail;		//order matters!!
			head = tail = null;
			return temp.element;
		}
		else
		{
			size--;
			Node<E> temp = tail;		//order matters!!
			Node<E> previous = head;
			//note: we want to get to the node BEFO(not0)RE the tail
			for (int i = 0; i < size - 2; i++)		//be careful with logic!
			{
				previous = previous.next;
			}
			tail = previous;
			tail.next = null;			//Don't forget this!!!!!
			return temp.element;
		}
		
	}
	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public E remove(int idx) {

		if (idx < 0 || idx >= this.size)  //check if index is OOB
		{
			return null;
		}
		else if (idx == 0) 
			return this.removeFirst();
		else if (idx == this.size - 1) 
			return this.removeLast();
		else
		{
			Node<E> previous = head;
			for (int i = 0; i < idx - 1; i++)		//be careful with logic!
			{
				previous = previous.next;
			}
			Node<E> current = previous.next;
			previous.next = current.next;
			current.next = null;
			size--;
			return current.element;
		}
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public E get(int idx) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object set(int idx, E e) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int indexOf(E e) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIindexOf(E e) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean contains(E e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new myListIterator();
	}
	
//	public myListIterator<E> iterator(){
//		return newMyListIterator()
//	}
//	
	class myListIterator<E> implements java.util.Iterator<E>{
		
		private Node<E> current = (Node<E>)head;
		
		@Override
		public boolean hasNext() {
			if (current != null)
				return true;
			else return false;
		}

		@Override
		public E next() {
			E temp = current.element;
			current = current.next;
			return temp;
		}
		

	}
}
