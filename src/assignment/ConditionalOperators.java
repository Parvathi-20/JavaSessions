package assignment;

public class ConditionalOperators {

	public static void main(String[] args) {
	
		int m1= 6; int m2 = 5; int m3 = 0; int m4 = 506;
		/*if (m1 > m2) {
			if (m1 > m3) {
				System.out.println("The greatest﻿:" + m1);
			} else {
				System.out.println("The greatest﻿:" + m3);
			}*/
		if(m1 > m2 && m1 > m3 && m1 > m4) {
			System.out.println("The greatest﻿:" + m1);
		}else if(m2 > m3 && m2 > m4){
			System.out.println("The greatest﻿:" + m2);
		}else if(m3 > m4){
			System.out.println("The greatest﻿:" + m3);
		}else {
			System.out.println("The greatest﻿:" + m4);
		}


		int num = 2;
		int res = num % 2;
		if(res == 0) {
			System.out.println("The given number is even " + num);
		}else {
			System.out.println("The given number is odd " + num);
		}
		
		int inputnum = 35;
//		int inputnum = -11;
		if( inputnum < 0) {
			System.out.println("The given number is -ve " + inputnum);
		}else {
			System.out.println("The given number is +ve " + inputnum);
		}
		
		
		
		
	}

}
