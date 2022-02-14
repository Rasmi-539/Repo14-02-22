package testNG;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://signup.ebay.com/pa/crte?usage=2943");
		
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();


		FileInputStream file = new FileInputStream("C:\\Users\\rasmirekha.m\\Downloads\\testRegistration.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rowCount =sheet.getLastRowNum();
		System.out.println(rowCount);
		
		
		for(int row=1;row<=rowCount;row++) {
			XSSFCell firstname = sheet.getRow(row).getCell(0);
			XSSFCell lastname = sheet.getRow(row).getCell(1);
			XSSFCell email = sheet.getRow(row).getCell(2);
			XSSFCell password = sheet.getRow(row).getCell(3);
			
			Object ob[] = {firstname, lastname,email,password};
			myData.add(ob);

		}
		Iterator<Object[]> iterator =myData.iterator();
		while(iterator.hasNext()) {
			driver.findElement(By.id("firstname")).sendKeys((CharSequence[]) iterator.next());
		}
		
	}


}
