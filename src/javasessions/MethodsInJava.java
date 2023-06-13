package javasessions;

public class MethodsInJava {

	// methods - class data members
//	1. no input no return
//	void - no return - function cant return anything

	public void test() {
		System.out.println("print test method");
		int i = 10;
		System.out.println(i);
	}

//	2. no input some return
//	int return 

	public int totalamount() {
		System.out.println("totalamount");
		int i = 10;
		int tax = 40;
		int payment = i + tax;
		return payment;

	}
	
	
	public String trainerName() {
		System.out.println("trainerName");
		String trainerName = "naveen";
		return trainerName;
	}

	public char getGender() {
		System.out.println("getGender");
		char c = 'a';
		return c;
	}
	
	
//	3. some input some return

	public int add(int i, int j) {
		int sum = i + j;
		return sum;
	}
	
	public static void main(String[] args) {

		MethodsInJava m1 = new MethodsInJava();// create the object
		m1.test(); // call the method
		System.out.println(m1.totalamount());
		
		String name = m1.trainerName();
		System.out.println(name);
		
		
		if(name.equals("naveen")) {
			System.out.println("Naveen Automation labs");
		}
		
		System.out.println(m1.getGender());
		char g = m1.getGender();
		System.out.println((byte)(g));
		
		int integerSum = m1.add(3,90);// arguments,values
		System.out.println(integerSum);
		
		
		int s2 = m1.add(-90,-40);
		System.out.println(s2);
	}

}
