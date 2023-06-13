package assignment;

public class Operators {

	public static void main(String[] args) {

	}

	static {
		int i = 11;// 12,13

		i = i++ + ++i;
		// 11+13
		System.out.println(i);
	}

	static {
		int a = 11, b = 22, c;
		// a=12,13 b=23,24
		c = a + b + a++ + b++ + ++a + ++b;
		// 11+22+11+22+13+24
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
	}

	static {
		int i1 = 0;// 1010
		i1 = i1++ - --i1 + ++i1 - i1--;
		// 0-0+1-1=0
		System.out.println(i1);
	}

	static {
		boolean b = true;
		// b++; - boolean cant be incremented directly
		System.out.println(b);
	}

	static {
		int i2 = 1, j2 = 2, k2 = 3;
		// 012
		int m = i2-- - j2-- - k2--;
		// 1-2-3=-4
		System.out.println("i2=" + i2);
		System.out.println("j2=" + j2);
		System.out.println("k2=" + k2);
		System.out.println("m=" + m);
	}

	static {
		// a21 b12
		int aa = 1, bb = 2;
		// 1-2+2-1=0
		System.out.println(--bb - ++aa + ++bb - --aa);
	}

	static {
		// i18191819 j28292829 k
		int i4 = 19, j4 = 29, k4;
		k4 = i4-- - i4++ + --j4 - ++j4 + --i4 - j4-- + ++i4 - j4++;
		// 19-18+28-29+18-29+19-28=
		System.out.println("i4=" + i4);
		System.out.println("j4=" + j4);
		System.out.println("k4=" + k4);
	}

	/*
	 * static { int i = 11; int j = --(i++); 
	 * //no value for decrement as left to   right
	 * 
	 * }
	 */

	static {
		// m = -1-2 n=-1-2
		int m = 0, n = 0;
		int p = --m * --n * n-- * m--;
		// -1*-1*-1*-1=1
		System.out.println(p);
	}

	static {
		int a1 = 1;// 2321
		a1 = a1++ + ++a1 * --a1 - a1--;
		// 1+3*2-2=1+6-2=5
		System.out.println(a1);
	}

	/*
	 * static { int a3 = 11++; System.out.println(a3); //direct increment for
	 * numeric cant be done }
	 */

	static {
		int ch = 'A';
		System.out.println(ch++);
		//65 ascii value of next char
	}

	static {
		char ch = 'A';
		System.out.println(++ch);
		// B as declaration is char
	}

	static {
		// d=2.5 d = 3.5
		double d = 1.5, D = 2.5;
		// 1.5+3.5=5.0
		System.out.println(d++ + ++D);
	}

}
