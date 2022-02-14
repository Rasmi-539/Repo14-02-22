package ass1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/multiplewindows.html");
		driver.manage().window().maximize();
		WebElement btn1 = driver.findElement(By.id("btn1"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(btn1));
		btn1.click();
		Thread.sleep(2000);

		WebElement btn2 = driver.findElement(By.id("btn2"));
		wait.until(ExpectedConditions.elementToBeClickable(btn2));
		btn2.click();
		Thread.sleep(2000);

		ArrayList<String> windHand = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windHand.get(0));
		Thread.sleep(2000);

		driver.quit();
		
	}

}
