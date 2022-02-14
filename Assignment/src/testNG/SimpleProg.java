package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleProg {
	
	WebDriver driver;
	@BeforeClass
	public void startUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Launching Browser");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		System.out.println("Closing Browser");

	}
	
	
	
	@Test
	public void tc_Login() {
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.navigate().back();
	}
	

}
