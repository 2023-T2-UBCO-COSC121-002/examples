package L03;

public class DynamicBindingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m(new GradStudent());
		m(new Student());
		m(new Human());
		m(new Object());
		
		m(new String());
	}

	//Java will match anything that is an Object to this
	//formal parameter
	public static void m(Object o) {
		System.out.println(o);
	}
}
