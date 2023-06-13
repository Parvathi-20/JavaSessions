package javatclasssessions;

public class Student {

//	WAF
//	create a method -- getstudentMarks
//	pass a parameter - studentname
//	return the student marks - int

	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for " + studentName.toUpperCase());
		int Marks = -1;
		switch (studentName.toLowerCase()) {
		case "Riya":
			Marks = 90;

			break;
		case "vikash":
			Marks = 100;

			break;
		case "naveen":
			Marks = 60;

			break;
		case "nitu":
			Marks = 80;

			break;
		default:
			System.out.println("Student Not found " + studentName);
			break;
		}
		return Marks;
	}

	public static void main(String[] args) {
		Student obj = new Student();

		int m1 = obj.getStudentMarks("naVeen");
		System.out.println(m1);

	}

}
