package ass1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		ArrayList<WebElement> list =new ArrayList<WebElement>(driver.findElements(By.tagName("a")));
		System.out.println(list.size());
		
		for(WebElement links:list) {
			System.out.println(links.getText()+" "+links.getAttribute("href"));
		}
	}

}
