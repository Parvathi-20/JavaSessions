package webDriver_Arch;

public interface WebDriver extends SearchContext {

	public void get(String URL);

	public String getTitle();

	public void click(String element);

	public void sendKeys(String element, String value);

	public void close();

	@Override
	public void findElement(String element);

}
