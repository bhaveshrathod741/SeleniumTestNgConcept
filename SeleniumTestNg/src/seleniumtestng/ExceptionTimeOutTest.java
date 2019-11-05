//We use to check for execute testcases in within time period
package seleniumtestng;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	@Test(timeOut=2)
	public void infiteLoop()
	{
		int i=1;
		
		while(i==1)
		{
			System.out.println(i);
		}
	}

}
