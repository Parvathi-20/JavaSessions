package OOP_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee obj = new Employee("Test", 25, 12000, "Pune");

		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getSalary());
		System.out.println(obj.getCity());

		obj.setAge(26);
		obj.setSalary(15000);

		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getSalary());
		System.out.println(obj.getCity());

//		Employee e1 = new Employee();
//		
//		e1.setName("Test");
//		System.out.println(e1.getName());

	}

}
