package javatclasssessions;

public class Employee {

	int EmpID;
	String EmpName;
	String Department;
	String Designation;
	String DOJ;
	float Experience;
	String Qualification;
	String Gender;
	boolean MaritalStatus;
	
	static String CompanyName = "IBM";
	static String MD = "ROGER";
	
	public static void main(String[] args) {
		
		Employee E1 = new Employee();
		E1.EmpID = 12345;
		E1.EmpName = "ABC";
		E1.Department = "IT";
		E1.Designation = "SENIOR ENGINEER";
		E1.DOJ = "11021998";
		E1.Experience = (float) 24.3;
		E1.Qualification = "M.Tech.";
		E1.Gender = "M";
		E1.MaritalStatus = false;
		
		System.out.println(Employee.CompanyName + " " + Employee.MD + " " + E1.EmpID + " " +  E1.Experience);
		
		Employee E2 = new Employee();
		E2.EmpID = 12346;
		E2.Department = "ADMIN";
		E2.Designation = "ENGINEER";
		E2.EmpName = "EGH";
		E2.DOJ = "31052000";
		E2.Experience = (float) 22.8;
		E2.Qualification = "M.Tech.";
		E2.Gender = "M";
		E2.MaritalStatus = false;
		
		
		System.out.println(Employee.CompanyName + " " + Employee.MD + " " + E2.EmpID + " " +  E2.Experience);
		
		
		Employee E3 = new Employee();
		E3.EmpID = 12347;
		E3.EmpName = "LMN";
		E3.Department = "HR";
		E3.Designation = "SENIOR MANAGER";
		E3.DOJ = "19071996";
		E3.Experience = (float) 26.7;
		E3.Qualification = "MBA";
		E3.Gender = "F";
		E3.MaritalStatus = true;
		
		System.out.println(Employee.CompanyName + " " + Employee.MD + " " + E3.EmpID + " " +  E3.Experience);
		
		

	}

}
