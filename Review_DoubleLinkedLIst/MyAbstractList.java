package Review_DoubleLinkedLIst;

public abstract class MyAbstractList<E> implements MyList<E>{

	protected int size = 0;								//The size of the list
	
	public MyAbstractList() {}
	public MyAbstractList(E[] o) {
		for (int i = 0; i < o.length; i++)
			this.add(o[i]);
	}
	public void add(E e) 								//adds e to the end
	{
		add(size, e);									//call the other add method
	}

	public boolean remove(E e)
	{
		if (indexOf(e) >= 0)
		{
			remove(indexOf(e));
			return true;
		}
		else return false;
	}

	public boolean isEmpty() {
		return (size == 0);
	}
	
	public int size() {
		return this.size;
	}
	
}
