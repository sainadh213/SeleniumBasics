package hybridfw_datadriven_keyworddriven_methoddriven;

import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.ITestResult;
import org.testng.ITestListener;

public class MyListeners implements ITestListener
{
    public void onTestStart(ITestResult result) {
        Reporter.log(String.valueOf(result.getName()) + " method started", true);
    }
    
    public void onTestSuccess(ITestResult result) {
        Reporter.log(String.valueOf(result.getName()) + " method passed", true);
    }
    
    public void onTestFailure(ITestResult result) {
        Reporter.log(String.valueOf(result.getName()) + " method failed", true);
        WebDriverCommonLib wlib = new WebDriverCommonLib();
       // wlib.getFullScreenshot("./screenshots/" + result.getName() + ".jpg");
    }
    
    public void onTestSkipped( ITestResult result) {
        Reporter.log(String.valueOf(result.getName()) + " method skipped", true);
    }
    
    public void onStart( ITestContext context) {
        Reporter.log(String.valueOf(context.getName()) + " started", true);
    }
    
    public void onFinish(final ITestContext context) {
        Reporter.log(String.valueOf(context.getName()) + " ended", true);
    }
}