package javatclasssessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
//		for (char ch = 'A'; ch <= 'Z'; ch++) {
//			System.out.println(ch + "=" + ((byte)(ch)));
//		}
//		
//		
//		for (int m = 1 ; m <= 100; m++) {
//			System.out.println( "welcome");
//		}
//		
//		int i = 1;
//		while( i <= 100 ) {
//			System.out.println( "welcome");
//			i++;
//		}
//		
//		for (int o = 1; o <= 100 ; o++ ) {
//			if(o % 2 != 0) {
//				System.out.println(o);
//			}
//		}
		
		//use cases of while loop
		//when no of iterations are not fixed
		//totla links or images on the page
		//webtable pagination on webpage
		//webpage load time (inconsistent)
		//webelement loading time
		//calendar :future or previous dates 
		//build is running : 10min, 1hr etc send mail
		
		
		int e = 1;
		do {
			e++;
			System.out.println(e);
			//break;
		}
		while(e<=10);

		
		int e1 = 1;
		do {		
			System.out.println(e1);
			e1++;
		
		}
		while(e1<=10);
		
		
//		int e2 = 1;
//		do {		
//			System.out.println(e2);
//		
//		}
//		while(e2<=10);
//		e2++;
		
	}

}
