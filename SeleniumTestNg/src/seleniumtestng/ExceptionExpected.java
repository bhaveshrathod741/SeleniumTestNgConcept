//When we want to fire exception in testng then we can use this keyword
package seleniumtestng;

import org.testng.annotations.Test;

public class ExceptionExpected {
	
	@Test (expectedExceptions = NumberFormatException.class)
	public void numberFormatErr()
	{
		String s ="10A";
		int i = Integer.parseInt(s);
		System.out.println(i);
	}

}
