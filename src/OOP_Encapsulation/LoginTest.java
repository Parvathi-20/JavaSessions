package OOP_Encapsulation;

public class LoginTest {

	public static void main(String[] args) {

		// reigstration

		LoginPage lp = new LoginPage("test@test.com", "t@123");

		lp.doLogin(lp.getUsername(),lp.getPassword());
		
		lp.setPassword("123@test");
		
		lp.doLogin(lp.getUsername(),lp.getPassword());
		
		System.out.println("**************");
		
		LoginPage lp1 = new LoginPage("abcd@test.com", "ab@123");
		lp1.doLogin(lp1.getUsername(),lp1.getPassword());
	}

}
