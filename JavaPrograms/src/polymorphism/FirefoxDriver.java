package polymorphism;

public class FirefoxDriver extends WebDriver{
	public void click() {
		System.out.println("Performing Click : FirefoxDriver()");
	}
	public void sendKeys() {
		System.out.println("Typing : FirefoxDriver()");
	}
	public void getTitle() {
		System.out.println("Getting Titile : FirefoxDriver()");
	}

}
