package ass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/WebTable.html");
		
		int row = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		int col = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td")).size();
		int row_col = driver.findElements(By.xpath("/html/body/table/tbody/tr/td")).size();

		System.out.println("Number of Rows: "+row);
		System.out.println("Number of Columns: "+col);
		System.out.println("Number of Rows and Columns: "+row_col);
		
		for(int i=1;i<=row;i++) {
			String data = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]")).getText();
			System.out.println(data);
		}
			System.out.println();
			
			driver.close();
	}
	

}
