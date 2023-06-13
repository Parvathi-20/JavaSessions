package assignment;

public class IfElseSwitch {

	public static void main(String[] args) {
		
		char ch = 'w';
		switch(ch) {
		case 'a':
			System.out.println(ch + " is an vowel");
			break;
		case 'e':
			System.out.println(ch + " is an vowel");
			break;
		case 'i':
			System.out.println(ch + " is an vowel");
			break;
		case 'o':
			System.out.println(ch + " is an vowel");
			break;
		case 'u':
			System.out.println(ch + " is an vowel");
			break;
		default:
		System.out.println(ch +  " is consonant");
		break;
		}
		
		
//	WAP to define the interest rate on the basis of Loan type using Switch Case
//
//	Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
//
//	For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan

		String Loantype = "Housing Loan";
				int sal = 35001;
		switch(Loantype) {
		case "Car Loan":
			System.out.println("you have applied for " + Loantype );
			break;
		case "Personal Loan":
			System.out.println("you have applied for " + Loantype );
			break;
		case "Education Loan":
			System.out.println("you have applied for " + Loantype );
			break;
		case "Housing Loan":
			if(sal < 35000) {
				System.out.println("NOT APPLICABLE FOR " + Loantype );
				break;
			}else {
				System.out.println("you have applied for " + Loantype );
			}
			default:
				System.out.println("Not available this type");
			 
		}
	
	
	
	
	
	}

}
