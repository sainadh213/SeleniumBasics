package hybridfw_datadriven_keyworddriven_methoddriven;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class BaseTest implements IAutoConsts {
	
public static WebDriver driver;
    
    public void openBrowser() throws Throwable {
        FileLib flib = new FileLib();
        String browserName = flib.readPropertyData("D:\\Selenium\\Automation\\data\\config.properties", "browser");
        if (browserName.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
            BaseTest.driver = (WebDriver)new ChromeDriver();
        }
        else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Automation\\drivers\\geckodriver.exe");
            BaseTest.driver = (WebDriver)new FirefoxDriver();
        }
        else {
            System.out.println("Enter proper browser name");
        }
        BaseTest.driver.manage().window().maximize();
        String appUrl = flib.readPropertyData("./data/config.properties", "url");
        BaseTest.driver.get(appUrl);
        WebDriverCommonLib wlib = new WebDriverCommonLib();
        //wlib.verify("actiTIME - Login", wlib.getPageTitle(), "Login Page");
        wlib.verify("LinkedIn Login, Sign in | LinkedLn", wlib.getPageTitle(), "Login Page");
    }

    public void closeBrowser() {
        BaseTest.driver.quit();
    }

}
