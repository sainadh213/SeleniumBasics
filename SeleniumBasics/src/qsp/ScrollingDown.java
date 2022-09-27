package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollingDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Automation\\drivers\\geckodriver.exe");
		//Through Upcasting 
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		//Through Type casting
		//JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,2000)");
		
		//Through Downcasting
		//RemoteWebDriver rwd=(RemoteWebDriver)driver;
		//rwd.executeScript("window.scrollBy(0,2500)");
		//Thread.sleep(2000);
		//rwd.executeScript("window.scrollBy(0,-2500)");
		
		WebElement add=driver.findElement(By.xpath("//h2[text()='Getting Started']"));
		 Point loc=add.getLocation();
		
		System.out.println(loc);
		RemoteWebDriver rwd=(RemoteWebDriver)driver;
		rwd.executeScript("window.scrollBy"+loc);

	}

}
