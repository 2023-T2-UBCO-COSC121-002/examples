package L06;

public class TestEdible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit();		
		Chicken c = new Chicken();
		//String s = new String();
		
		Object[] o = {f,c};
		
		for (int i = 0; i < o.length; i++){
//			Object innerObj = o[i];
//			Edible e = (Edible)innerObj;
			Edible e = (Edible) o[i];

			System.out.println(e.howToEat());
			//e.printHi();   //don't do this!!
			
			e.spoil();
			
			Edible.printHi();
		}
	
	}

}
