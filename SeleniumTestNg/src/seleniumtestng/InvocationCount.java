/*When we system need to run same testcase again and again then we can
use Invocation count*/

package seleniumtestng;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount=2)
	public void count()
	{
		System.out.println("Run testcase multiple time");
	}
}
