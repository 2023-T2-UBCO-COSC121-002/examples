package L13;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack = new MyStack();
		
		String str = "this is a string!";
		
		for (char s : str.toCharArray())
		{
			stack.push(s);
		
		}
		
		while(!stack.isEmpty())
			System.out.print(stack.pop());
	}
	

}
