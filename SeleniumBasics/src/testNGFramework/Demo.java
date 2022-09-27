package testNGFramework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void run1()
	{
		//System.out.println("only console");
		//Reporter.log("only Report");
		//Reporter.log("Both Report+Console", true);
		Reporter.log("Demo message", true);
		
	}

}
