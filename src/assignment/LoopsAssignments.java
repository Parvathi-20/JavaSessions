package assignment;

public class LoopsAssignments {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println("I am Batman");
		}

		for (int i = 1; i <= 9; i++) {
			System.out.println("I am Batman " + i);
		}

		System.out.println("for loop o/p");
		for (int i = 10; i >= 1; --i) {

			System.out.println(i);
		}

		int i = 10;
		System.out.println("while loop o/p");
		while (i >= 1) {

			System.out.println(i);
			--i;
		}
		
		System.out.println("do while loop o/p");
		int i1 = 10;
		do {
			System.out.println(i1);
			--i1;
		} while (i1 >= 1);

		
		int p = 1;
		while(p <= 10) {
			System.out.println("Hello World");	
			p++;
		}
		
		
		int q = 5;System.out.println("while loop o/p");
		while(q <= 100) {
//			if(q % 5 == 0) {
//				System.out.println(q);	
//				}	
			System.out.println(q);	
			q=q+5;			
		}
		
		System.out.println("for loop o/p");
		for(int m = 5; m<= 100; m++) {
			if(m % 5 == 0) {
				System.out.println(m);	
				}			
			m=m+4;	
		}
		
		int n = 5;System.out.println("do while loop o/p");
		do {
			if(n % 5 == 0) {
				System.out.println(n);
				n=n+5;	
			}				
		}while(n <= 100);
		
		
		System.out.println("for loop o/p");
		for(char ch = 'A';ch <= 'Z'; ch++) {
			System.out.println(ch + "-" + ((byte)(ch)));
		}
		for(char ch = 'a';ch <= 'z'; ch++) {
			System.out.println(ch + "-" + ((byte)(ch)));
		}	
		for(char ch = '0';ch <= '9' ; ch++) {
			System.out.println(ch + "**" + ((byte)ch));
		}
		
		
		System.out.println("while loop o/p");
		char ch1 = 'A';
		while(ch1 <= 'Z') {
			System.out.println(ch1 + "-" + ((byte)(ch1)));
			ch1++;
		}
		char ch2 = 'A';
		while(ch2 <= 'Z') {
			System.out.println(ch2 + "-" + ((byte)(ch2)));
			ch2++;
		}
		char b = '0';
		while(b <= '9') {
			System.out.println(b + "-*-" + ((byte)(b)));
			b++;
		}

		System.out.println("for loop o/p");
//		float f = (float) 1.0;
		for(float f = 1.0f ;f <= 10.0 ; f++ ) {
			System.out.println(f);
		}
		
		
		System.out.println("*******o/p******");
		int a = 0;
		for(;a <= 100;a++) {
			if(a%9 == 0) {
				System.out.println(a);
			}
		}
		
		
//		char vow = 'w';
		for(char vow = 'a'; vow <= 'z'; vow++) {
			if(vow == 'a' | vow == 'e' | vow == 'i' | vow == 'o' | vow == 'u') {
				System.out.println("the vowels are "  + vow);}
		}

		//while for vowels
		
		
		int h = 1;
		for(; h <= 10 ; h++) {
			System.out.println(h);
			if(h % 7 == 0) {
				System.out.println( "bye, see you tomorrow");
				break;
				}			
		}
		
		int l =1;
		do {
			System.out.println(l);
			if(l % 7 == 0) {
				System.out.println( "bye, see you tomorrow");
				break;
			}l++;
			
		}while (l <= 10);
		
	}

}
