package testNG;

import org.testng.annotations.Test;

public class TestPriority {
	
	@Test
	public void login() {
		System.out.println("Login Completed");
	}
	
	@Test
	public void logout() {
		System.out.println("Logout Completed");
	}
	
	@Test(priority=1)
	public void addEmp() {
		System.out.println("Employee Added");
	}
	
	@Test(priority=1)
	public void delEmp() {
		System.out.println("Employee Deleted");
	}

}
