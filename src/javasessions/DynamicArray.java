package javasessions;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		System.out.println(ar.size());// pc = 0, vc = 0

		ar.add(100);
		ar.add(200);

		System.out.println(ar.size());

		ar.add(300);
		ar.add(400);
		ar.add(500);

		System.out.println(ar.size());
		System.out.println(ar.get(0));
//		System.out.println(ar.get(5)); Index out of range exception
//		System.out.println(ar.get(-1));Index out of range exception
		
		ar.add(12.33);
		ar.add(true);
		ar.add('m');
		ar.add("testing");
		
		System.out.println(ar.size());
		

	}

}
