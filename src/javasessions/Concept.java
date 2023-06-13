package javasessions;

import java.util.ArrayList;

public class Concept {

	// WAF:
	// supply a browser name : String: chrome/ff/safari/IE
	// buss logic: launch the browser
	// return true

	public boolean launchBrowser(String browser) {
		System.out.println("Browser selected is " + browser);
		boolean flag = true;
		switch (browser.toLowerCase().trim()) {
		case "Chrome": {
			System.out.println("Launch chrome");
			break;
		}
		case "edge": {
			System.out.println("Launch edge");
			break;
		}
		case "opera": {
			System.out.println("Launch opera");
			break;
		}
		case "firefox": {
			System.out.println("Launch firefox");
			break;
		}
		case "safari": {
			System.out.println("Launch safari");
			break;
		}
		default:
			System.out.println("Pls pass the right browser name " + browser);
			flag = false;
			break;
		}
		return flag;
	}

	public void testing() {
		System.out.println("testing");
		return;
	}

	// WAF:
	// supply input param: Company Name (String): IBM, MS, Google
	// return : the list of employee of the comp: ArrayList<String>

	public ArrayList<String> getEmpList(String companyName) {

		System.out.println("Company Name is " + companyName);

		ArrayList<String> empList = new ArrayList<String>();
		if (companyName.equalsIgnoreCase("IBM")) {
			empList.add("Rakesh");
			empList.add("ravi");
			empList.add("geeta");
		} else if (companyName.equalsIgnoreCase("google")) {
			empList.add("chetan");
			empList.add("suraj");
			empList.add("chandan");
		} else if (companyName.equalsIgnoreCase("MS")) {
			empList.add("fawad");
			empList.add("druv");
			empList.add("rati");
		} else {
			System.out.println("comapany name not found " + companyName);
		}

		return empList;
	}

	public static void main(String[] args) {
		Concept c1 = new Concept();
		ArrayList<String> employess = c1.getEmpList("GooGle");
		System.out.println(employess);
		System.out.println(employess.size());
		
		boolean isLaunched = c1.launchBrowser("opea");
		if (isLaunched){
			System.out.println("Enter the url");
		} else {
			System.out.println("failed to load the browser");
		}
		
	}

}
