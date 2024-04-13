package Review_DoubleLinkedLIst;

import java.util.Iterator;
import java.util.ListIterator;


/**
 * A doubly linked list 
 * @param <E>
 */
public class MyLinkedList<E> extends MyAbstractList<E> {

	int size = 0;
	
	private Node<E> head =null;
	private Node<E> tail =null;
	
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
			
			tail.next = newNode;  //links forward
			newNode.previous = tail; //links backwards
			
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
			newNode.next = head;  //do this first (same as SLL)
			head.previous = newNode;	// DLL previous pointer
			
			head = newNode;
			//head.previous = null;
		}
		size ++;		//don't forget to increase size
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
				previous.next.previous = newNode;		//the back link to new node
				
				newNode.previous = previous;
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
			head = head.next;			//move forward 1 node	
			head.previous = null;		//break the line back to the old head
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
			
			tail = tail.previous; 		//move tail ref back 1 node
			
			tail.next = null;			//break the link to the node being removed
			temp.previous = null;		//meh - ok
			return temp.element;
		}
		
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
			
			Node<E> current = previous.next;			//same same (no change from SLL)
			previous.next = current.next;				//same 
			current.next.previous = previous;			//make our back link
			
			current.previous = null;			
			current.next = null;
			
			size--;
			
			return current.element;
		}
	}
	@Override
	public void clear() {
		head = null;
		tail = null;
		size =  0;
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
	public ListIterator<E> iterator() {
		// TODO Auto-generated method stub
		return new myListIterator();
	}
	

	class myListIterator implements java.util.ListIterator<E>{
		
		private Node<E> current = (Node<E>) head;
		private Node<E> previous = current.previous;
		
		@Override
		public boolean hasNext() {
			if (current != null)
				return true;
			else return false;
		}
		
		public boolean hasPrevious() {
			if (previous != null)
				return true;
			else return false;
		}
		

		@Override
		public E next() {
			E temp = current.element;
			previous = current;
			current = current.next;
			return temp;
		}
		
		
		public E previous() {
			E temp = previous.element;
			current = previous;
			previous = previous.previous;
			return temp;
		}
		
		
		public void remove() {
			
		}

		@Override
		public int nextIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int previousIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void set(E e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void add(E e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	//this is an inner class for my Node 
	@SuppressWarnings("hiding")
	class Node<E> {

		private E element;				//the contents
		private Node<E> next;			//reference to next node
		private Node<E> previous;		//reference to previous node
		
		public Node(E e) {
			this.element = e;
		}
	}
}
