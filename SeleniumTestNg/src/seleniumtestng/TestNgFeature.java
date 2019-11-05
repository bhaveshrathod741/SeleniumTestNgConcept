package seleniumtestng;

import org.testng.annotations.Test;

public class TestNgFeature {

	@Test
	public void login()
	{
		System.out.println("Login testcase");
		int i =9/0;
	}
	@Test (dependsOnMethods ="login")
	public void Dashboard()
	{
		System.out.println("User dashboard testases");
	}
}
