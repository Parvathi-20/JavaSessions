package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {

//		1.while

//		print 1-10

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		int k = 1;
		while (k < 10) {
			System.out.println("welcome to taj"); // 12
			if (k == 5) {// no no
				break;
			}
			k++;
		}

		// for loops
//		1 to 10 
		// for(initialize,condition,increment or decrement)
		int j = 1;
		for (; j <= 10; j++) {
			System.out.println(j);

		}

		int c = 1;
		for (; true;) {
			System.out.println("welcome to automation labs");
			if (c == 5) {
				break;
			}
			c++;
		}

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + "=" + (byte) ch);
		}
		System.out.println("*************");
		byte b = 'a';
		System.out.println(b);

		// double, float, int, short, byte, long, char -- for/while
		// WAP to print naveen 100 times

		//
		for (double d = 1.1; d <= 5.1; d++) {
			System.out.println(d);
		}

		//
		for (int w = 1; w <= 100; w++) {

			if (w % 2 == 0) {
				System.out.println(w);
			}

		}

		// use cases of while loop:
		// when number of iterations are not fixed -- while loop
		// total links/images on the page
		// webtable pagination 1 2 3 4...next
		// webelement is loading on the page
		// page load time out
		// calendar:
		// build is running : 10, 1 hr , 2 hr, 30 mins
		// read data from DB: SQL -- rows/colns

		// use cases of for loop:
		// when number of iterations are fixed -- for loop
		// month/days drop down --> 1 to 12
		// category options -->
		// Arrays, Arraylist
		// excel file -- test data -- rows = 1 to rowSize()
		// country drop down --> 1 to 230 ---> if name = brazil -- break;
		// Read data : JSON/XML
		// read data from DB: SQL -- rows/colns

		// do-while loop:
			
		int e = 1;
		do {
			System.out.println(e);
			e++;
		}while( e <= 10);

		// use cases :
		// 1. webtable paginaton: check if element is already present in the table ,
		// click on it and end the loop
		// 2. go and check the element first and then start the while loop
		// 3. calendar:
		// 4. for each
		// 5. streams

	}

}
