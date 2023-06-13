package assignment;

import java.util.Arrays;

public class ArrayListQuestions {

	public static void main(String[] args) {

		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 };
		//static array value will be filled with last but one
		System.out.println(p.length);
		for (int i = 0; i < p.length -1; i++) {
			p[i] = p[i];
			if(i == 5) {
				p[i] = p[i + 1];
				i++;
			}
			
		}

		System.out.println(Arrays.toString(p));

	}

}
