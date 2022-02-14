package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationHierarchy {
	
	@Test
	public void tc001() {
		System.out.println("First testcase executed");
	}
	
	@Test
	public void tc002() {
		System.out.println("Second testcase executed");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("It will execute before the test Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("It will execute after the test Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("It will execute before the Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("It will execute after the Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("It will execute before the Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("It will execute after the Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("It will execute before the Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("It will execute after the Method");
	}

}
