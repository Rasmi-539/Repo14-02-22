package ass1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import java.awt.*;
//import java.awt.event.KeyEvent;

public class CopyPaste {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		WebElement para1 = driver.findElement(By.xpath("/html/body/div/main/section[2]/div/div/div[1]/div/div[1]/p[2]"));
		
		Actions ac = new Actions(driver);
		ac.click(para1);
		ac.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
		ac.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		
		File file = new File("D:\\pasteData.txt");
		file.createNewFile();
		
		//FileWriter fw = new FileWriter(file);
		//fw.write("How are you?");
		//fw.close();
		//BufferedWriter filewriter = new BufferedWriter(fw);
		
				
		String a = ac.sendKeys(Keys.chord(Keys.CONTROL+"v")).toString();
		FileWriter fw = new FileWriter("D:\\pasteData.txt");
		fw.write(a);
		fw.flush();

		
	}

}
