package L14;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {

	public static void main(String[] args) {
//		int x = 5;
//		m(x);
//		
		ArrayList<Integer> x = new ArrayList<>(List.of(6, 3, 0));
		x.remove(Integer.valueOf(6));
		System.out.print(x);
		x.remove(0);
		System.out.print(x);

	}
	
	//Q1
//	static void m(Integer x) { System.out.print(1); }
//	static void m(long x)    { System.out.print(2); }		//closest match!
//	Q2
	static void m(Integer x) { System.out.print(1); }
	static void m(double x)  { System.out.print(2); }


}
