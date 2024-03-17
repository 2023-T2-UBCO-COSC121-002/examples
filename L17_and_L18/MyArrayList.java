package L17_and_L18;

import java.util.Iterator;

public class MyArrayList<E> extends MyAbstractList<E> {
	
	private E[] data = null;
	
	public MyArrayList() {}
	public MyArrayList(E[] o) {}
	
	public void trimToSize() {
		
	}
	
	//doubles size 
	private void ensureCapacity(){
		
	}
	
	//Throws exception if index is OOB
	private void checkIndex(int idx) {
		
	}

	@Override
	public void add(int idx, E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int idx) {
		// TODO Auto-generated method stub
		return null;
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
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
