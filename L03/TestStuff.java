package L03;

public class TestStuff {

	
	public static void print(Car c)
	{
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Car c ;  // = new Car();
		
		c = new Audi();
		
		//This will take any object that has car as a ancestor
		print(c);
		
		c = new Volkswagen();
		
		print(c);
		
		//Audi a = new Car();  //yuck!
		
		Audi a = new Audi();
		
		print(a);
		
		Fish f = new Fish();
		
		//c = f;
		c = null;
		
		c = new GTI();
		
		//c = (Car)f;
		
		c = (Car)a;
		
		print(c);
		
		//c = (Object) a;
		
		c = new Audi();
		c.go();
		
		//DANGER!!!!!!
		Object o = new Car();
		
		//o.go();
		
		//o = f;
		
		//o.go();
		
		
		c = new GTI();
		print(c);
		
		//c.honk();
		//This won't work and will be a runtime error 
		//of ClassCastException
//		GTI gti = (GTI)new Car();
//		gti.honk();
		
	}
}
