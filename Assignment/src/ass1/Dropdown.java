package ass1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://test02.cignition365.com/channel-partner/");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		WebElement dropdown =driver.findElement(By.id("MainContent_MainContentSection_C006_ddlLanguages"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Korean");
		List<WebElement> count =dropdown.findElements(By.tagName("option"));
		System.out.println("Total values present in dropdown :"+count.size());
		System.out.println("----LIST OF VALUES----");
		for(WebElement counts:count) {
			System.out.println(counts.getText());
		}
		
		driver.close();
		/*
		 * List<WebElement> allDropdown = driver.findElements(By.tagName("select"));
		 * System.out.println(allDropdown.size());
		 */

	}
}
