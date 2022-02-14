package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
	WebDriver driver;

	@Test
	@Parameters({"browser","url","emailid"})
	public void gmailLoginTest(String browser, String url, String emailid) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		driver.get(url);
		driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
		driver.findElement(By.id("identifierId")).sendKeys(emailid);
		driver.close();
	}
}
