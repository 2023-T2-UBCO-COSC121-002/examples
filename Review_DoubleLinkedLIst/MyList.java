package Review_DoubleLinkedLIst;

public interface MyList<E> extends Iterable<E> {
	
	public void add(E e);		//adds e to the end
	public void add(int idx, E e);

	public boolean remove(E e);
	public E remove(int idx);
	public void clear();
	
	public E get(int idx);
	public Object set(int idx, E e);
	
	public int indexOf(E e);
	public int lastIindexOf(E e);
	public boolean contains(E e);
	public boolean isEmpty();

	public int size();
	
	public java.util.Iterator<E> iterator();
	

	
}
