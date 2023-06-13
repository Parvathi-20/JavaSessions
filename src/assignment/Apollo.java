package assignment;

public class Apollo extends Hospital {

	@Override
	public void AddNewpatient(String patientName) {

		System.out.println("Apollo >> New Patient registration " + patientName);
	}

	@Override
	public void AddDiagnosisInformation() {

		System.out.println("Apollo >> Diagnosis details ");
	}

	public void getDoctorsdetails() {
		System.out.println("Doctors avaiable at apollo ");

	}

	public void getDepartmentdetails() {
		System.out.println("Appllo department details");
	}
}
