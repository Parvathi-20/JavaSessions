package javatclasssessions;

import java.util.Arrays;

public class LoopForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Object employee[] = new Object[5];
		employee[0] = "test";
		for(Object e: employee) {
			System.out.println(e);
		}
		
		
		Object emp[] = new Object[5];
		emp[0] = "Tom";
		emp[1] = 30;
		emp[2] = 23.3;
		emp[3] = 'm';
		emp[4] = true;
		
		System.out.println(Arrays.toString(emp));
		
		System.out.println("************");
		
		int r = 065;
		System.out.println(r);
		
		
	}

}
