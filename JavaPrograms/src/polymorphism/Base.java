package polymorphism;

public class Base {
	public WebDriver getBrowserInstance(String browserName) {
		if(browserName.equals("Chrome")) {
			return new ChromeDriver();
		}
		else if(browserName.equals("Firefox")) {
			return new FirefoxDriver();
		}
		else if(browserName.equals("IE")) {
			return new IEDriver();
		}
		else  {
			return new ChromeDriver();
		}
	}

}
