package OOP_Encapsulation;

public class LoginPage {

	private String username;
	private String password;

	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin(String Uname, String pwd) {
		System.out.println("Enter user name " + Uname);
		System.out.println("Enter password " + pwd);

		if (alreadyRegisteredUser(Uname)) {
			System.out.println("User ia already registered");

		} else {
			System.out.println("User is logged in");
		}

	}

	private boolean alreadyRegisteredUser(String Uname) {
		System.out.println("checking user status");
		return true;

	}

}
