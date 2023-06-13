package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeatures {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>(20);
		// vc = 20;pc=0;
		// LF = vc/2 = 10;

		// vc = 5, pc=0;
		// pc=5, LF = 5/2 = 2

		ArrayList<Integer> numlist = new ArrayList<Integer>();
		// vc= 10;pc=0;
		numlist.add(100);
		numlist.add(200);
		numlist.add(300);
		numlist.add(400);

		System.out.println(numlist.size());// 4
		numlist.remove(3);
		System.out.println(numlist.get(2));
		System.out.println(numlist);

		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Tom", "pter", "bob", "rob"));
		System.out.println(empList.size());
		System.out.println(empList);
		
		empList.add("Lisa");
		empList.add(0, "Ankity");
		System.out.println(empList);
//		
//		empList.add(8, "Test");
//		System.out.println(empList);
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		System.out.println(nums);
		
		
		List<String> Pageslist = Arrays.asList("Login","Home", "Products","order","Paymens");
		
		
		ArrayList<Integer> nList = new ArrayList<Integer>();
		nList.add(100);
		nList.add(260);
		nList.add(10);
		nList.add(4000);
		nList.add(40);
		nList.add(5);
		
		System.out.println(nList);
		
		
		Collections.sort(nList);
		System.out.println(nList);
		
		Collections.reverse(nList);
		System.out.println(nList);
		
		
		
		int test[] = {489,89,23,25,678,46,78,999};
		Arrays.sort(test);
		System.out.println(Arrays.toString(test));
		
		
		ArrayList<String> myList = new ArrayList<String>(Collections.nCopies(10,"Apple"));
		System.out.println(myList);
 		

	}

}
