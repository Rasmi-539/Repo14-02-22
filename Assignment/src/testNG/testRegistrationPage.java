package testNG;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtility;

public class testRegistrationPage {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://signup.ebay.com/pa/crte?usage=2943");
	}
	
	
	  @DataProvider 
	  public Iterator<Object[]> getTestData() throws IOException {
	  ArrayList<Object[]> testData = TestUtility.getDataFromExcel(); 
	  return testData.iterator(); }
	 
	
	@Test(dataProvider="getTestData")
	public void ebayRegPageTest (String firstname, String lastname, String email, String password) throws IOException{
		
		driver.findElement(By.id("firstname")).sendKeys(firstname);
		driver.findElement(By.id("lastname")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);


	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
