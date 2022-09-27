package keywordDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.actitime.com/login.do");
		/*WebElement untb=driver.findElement(By.id("username"));
		//untb.sendKeys("admin");
		driver.navigate().refresh();
		untb.sendKeys("admin");*/
		LoginPOMClass lp=new LoginPOMClass(driver);
		driver.navigate().refresh();
		lp.getUntb().sendKeys("admin");
		

	}

}
