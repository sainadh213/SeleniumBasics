package testNGFramework;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyFeature {
	@Test(priority=1)
	public void transfer1()
	{
		Reporter.log("Successfully Transfered", true);
	}
	@Test(priority=2)
	public void transfer2()
	{
		//Assert.fail();
		Reporter.log("Successfully Transfered", true);
	}
    @Test(priority=2,dependsOnMethods={"transfer1","transfer2"},alwaysRun=true)
    public void delete()
    {
    	Reporter.log("Successfully Deleted", true);
    }
}
