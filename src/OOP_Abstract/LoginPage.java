package OOP_Abstract;

public class LoginPage extends Page{
	
	//hidden default constrctor
	//own default constructor
	
	public LoginPage() {
		System.out.println("login page default constructor");
	}

	public LoginPage(int i) {
		System.out.println("login page parameterised constructor" + i);
	}
	
	@Override
	public void title() {
		System.out.println("login title");
		
	}

	@Override
	public void url() {
		System.out.println("https://www.abc.com/login.html");	
		
	}
	
	@Override
	public void pageLoadTimeout() {
		System.out.println("page time out -- 5 sec");
	}


	public void forgotpwd() {
		System.out.println("forgotpwd");
	}
	
	
}
