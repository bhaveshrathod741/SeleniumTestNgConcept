//Demostration of using data provider run same test case multiple times
package seleniumtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider {

	WebDriver driver;
	String path = System.getProperty("user.dir");

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", path + "//Browser//chromedriver.exe");
		driver = new ChromeDriver(); // Instantiate Chromedriver
		driver.manage().window().maximize();// Maximize window
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");

	}

	// Crete dataprovider method

	@DataProvider(name = "loginData")
	public Object[][] loginData() {
		Object[][] ar = null;
		ar = new Object[][] { { "abc@gmail.com", "123456" } };
		return ar;
	}

	@Test(dataProvider = "loginData")
	public void loginTest(String Email, String Password) {
		WebElement eMail = driver.findElement(By.xpath("//*[@type='email']"));
		eMail.clear();
		eMail.sendKeys(Email);

		WebElement psd = driver.findElement(By.xpath("//*[@type='password']"));
		psd.clear();
		psd.sendKeys(Password);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
