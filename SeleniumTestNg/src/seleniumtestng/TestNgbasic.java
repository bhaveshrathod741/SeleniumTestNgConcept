//Sample annotation sequence execution order demo in testng

package seleniumtestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgbasic {
	
	@BeforeSuite
	public void setup()
	{
		System.out.println("Setup done");
	}
	
	@BeforeTest
	public void launch_browser()
	{
		System.out.println("Launch browser");
	}
	
	@BeforeClass
	public void enterURL()
	{
		System.out.println("Enter URL");	
	}

	@BeforeMethod
	public void login()
	{
		System.out.println("Log in app");
	}
	
	@Test
	public void verifyTitle()
	{
		System.out.println("Verify page title");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout from application");
	}
	@AfterTest
	public void deleteCookies()
	{
		System.out.println("Delete all cookies");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Closed browser");
	}
}
