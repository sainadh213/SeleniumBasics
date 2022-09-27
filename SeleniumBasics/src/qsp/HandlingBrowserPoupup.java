package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingBrowserPoupup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://v1.hdfcbank.com/assets/popuppages/netbanking.htm");

	}

}
