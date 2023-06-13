package assignment;

public class DataTypes {

	public static void main(String[] args) {
		/*
		 * 1. Write a Java program to print 'Hello' on screen and then print your name
		 * on a separate line.
		 * 
		 */
		System.out.println('j');
		System.out.println('j'+'a'+'v'+'a');
		System.out.println("Hello" + "\n" + "Parvathi");
		System.out.println("Hello\nParvathi");
		
		/*
		 * 2. Write a Java program to print the sum of two numbers.
		 * 
		 * Test Data:
		 * 
		 *  74 + 36
		 */
		
		int i = 74;
		int j = 36;
		int sum = i + j ;
		System.out.println(sum);
				
		/*
		 * 3. Write a Java program to divide two numbers and print on the screen.
		 * 
		 * Test Data:
		 * 
		 * 50/3
		 */
		
		int a = 50;
		int b = 3;
		float result = a/b ;
		System.out.println(result);

		/*
		 * 5. Write a Java program to compute the specified expressions and print the
		 * output. Go to the editor
		 * 
		 * Test Data:
		 * 
		 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
		 */
		
		double result2 =  ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(result2);
		
		/* 6. Try to concat "Hello Selenium" with a character 't'. */
		String s1 =  "Hello Selenium";
		char s2 = 't';
		System.out.println(s1+s2);
		
		/*
		 * 7. Create three int variables having values like : 100, 200, 3400. Add them
		 * and concatenate and generate this output String : 
		 * 
		 * "Your Total amount is. 3700".
		 */
		
		int a1 = 100;
		int a2 = 200;
		int a3 = 3400;
		int sum2 = a1 + a2 + a3;
		System.out.println("\""+"Your Total amount is." +sum2+"\"");
		
		
		/* Print the ASCII value of the character 'h'. */
		System.out.println((byte)'h');
		
		/*
		 * Write a program to add 3 to the ASCII value of the character 'd' and print
		 * the equivalent character.
		 */
		
		int d1 = 3;
		char d = 'd';
		int d3 = d1 + d;
		System.out.println((char)d3);
		
		/* Write a program to find the square of the number 3.9. */
		
		float f1 = 3.9f;
		float r1 = f1*f1;
		System.out.println(r1);
		
		
		
	
	}

}
