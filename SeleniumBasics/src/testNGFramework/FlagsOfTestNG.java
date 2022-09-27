package testNGFramework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagsOfTestNG {

	@Test(priority = 1, invocationCount=5)
	public void run()
	{
		Reporter.log("Run message", true);
	}
	@Test(priority = 2,enabled=false)
	public void bun()
	{
		Reporter.log("Bun message", true);
	}
	@Test(priority = 3,enabled=true)
	public void gun()
	{
		Reporter.log("Gun message", true);
	}
}
