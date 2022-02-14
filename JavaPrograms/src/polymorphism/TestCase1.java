package polymorphism;

public class TestCase1 extends Base {
	String browserName="Chrome";
	public static void main(String[] args) {
		TestCase1 tc = new TestCase1();
		tc.initBrowser();
		
	}
	
	public void initBrowser() {
		WebDriver driver = getBrowserInstance(browserName);
		driver.click();
		driver.sendKeys();
		driver.getTitle();
		
	}

}
