package javasessions;

public class Employee {
	//class varaible - class data memebrs
	
	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		
		//String name = "naveen"; - local varaibale
		
		//class - template / blueprint of the objects / category of the object
		//object - physical entity
		//object of the class - new keyword
		
		Employee obj = new Employee();
		obj.name = "Tom";
		obj.age = 30;
		obj.city = "Pune";
		System.out.println(obj.name + " " + obj.age + " " + obj.city );
		
		Employee obj1 = new Employee();
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.city);

		
		obj1.name = "naveen";
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.city);
		
		//no reference objects - not recomended

		new Employee().name = "Pter";
		new Employee().age = 23;
		new Employee().city = "Blore";
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.city);
		


	}

}
