//Basic TestNG framework
package seleniumtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	//Declare variable
	
	WebDriver driver;
	String path = System.getProperty("user.dir");
	
	
	@BeforeMethod
	public void setUp()
	{
		//Setup browser
		System.setProperty("webdriver.chrome.driver", path+"//Browser//chromedriver.exe");
		driver = new ChromeDriver(); //Instantiate Chromedriver
		driver.manage().window().maximize();//Maximize window
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		
	}
	
	@Test (priority=1)
	public void PageTitle()
	{
		//String actualTitle ="google - Google Search";
		String expectedTitle =driver.getTitle();
		System.out.println(expectedTitle);
	}
   
	@Test (priority=3)
	public void googleLogoTest()
	{
		boolean b =driver.findElement(By.xpath("//*[@id='logo-default'])")).isDisplayed();
		System.out.println(b);
	}
	
	@Test (priority=2)
	public void mailLinkText()
	{
		boolean a =driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.close();
	}
}
