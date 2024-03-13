package L16;

import java.util.ArrayList;


public class GenericStack <E> {
	
	private ArrayList<E> al = null;
	

	public GenericStack() {
		al = new ArrayList<>();
	}
	
	public boolean isEmpty()
	{
		return al.isEmpty();
	}
	
	public int size() {
		return al.size();
	}
	
	public E peek()
	{
		if (this.size() > 0)
			return al.get(this.size() - 1);
		else
			return null;
		
	}
	
	public E pop() 
	{
		if (this.size() > 0)
			return al.remove(this.size() - 1);
		else
			return null;	
	}
	
	public void push(E o)
	{
		al.add(o);
	}

	
}