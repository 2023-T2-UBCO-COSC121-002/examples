package L13;

import java.util.ArrayList;

public class MyStack implements COSC121_Stack{
	
	private ArrayList<Object> al = null;
	

	public MyStack() {
		al = new ArrayList<>();
	}
	
	public boolean isEmpty()
	{
		return al.isEmpty();
	}
	
	public int size() {
		return al.size();
	}
	
	public Object peek()
	{
		if (this.size() > 0)
			return al.get(this.size() - 1);
		else
			return null;
		
	}
	
	public Object pop() 
	{
		if (this.size() > 0)
			return al.remove(this.size() - 1);
		else
			return null;	
	}
	
	public void push(Object o)
	{
		al.add(o);
	}

	
}
