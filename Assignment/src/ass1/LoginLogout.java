package ass1;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginLogout {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://test02.cignition365.com/channel-partner/");
		
		FileInputStream file = new FileInputStream("C:\\Users\\rasmirekha.m\\Downloads\\credential.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		System.out.println(sheet.getSheetName());
		XSSFCell username = sheet.getRow(1).getCell(0);
		XSSFCell password = sheet.getRow(1).getCell(1);

		
		driver.findElement(By.id("MainContent_MainContentSection_C001_txtUsername")).sendKeys(username.getStringCellValue());
		driver.findElement(By.id("MainContent_MainContentSection_C001_txtPassword")).sendKeys(password.getStringCellValue());
		driver.findElement(By.id("MainContent_MainContentSection_C001_btnLogin")).click();
		System.out.println("Login Completed");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Logout']")).click();
		System.out.println("Logout Completed");
		driver.close();
	}
}

