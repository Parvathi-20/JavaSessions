package OOP_Interface;

public class CollegeEnrollment {

	public static void main(String[] args) {
		GovtCollege govtcol = new GovtCollege();
		govtcol.BachelorofAccounting();
		govtcol.BachelorofHR();	
		
		
		Education ed = new Education();
		ed.BachelorsProgram();
				
		USUniversity USuni = new GovtCollege();
		USuni.BachelorofNursing();
		
		
	}


}
