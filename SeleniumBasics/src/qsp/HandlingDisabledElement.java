package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Automation\\drivers\\geckodriver.exe");
		//Through Upcasting 
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/SaiNadh/OneDrive/Desktop/DisabledElement.html");
		Thread.sleep(2000);
        WebElement unadd=driver.findElement(By.id("i1"));
        unadd.sendKeys("admin");
        WebElement psadd=driver.findElement(By.id("i2"));
       // psadd.sendKeys("manager");
        Thread.sleep(2000);
        if(psadd.isEnabled())
        {
        	System.out.println("password is Enabled");
        	psadd.sendKeys("manager");
        }
        else
        {
        	System.out.println("password is Disabled");
        	JavascriptExecutor jse=(JavascriptExecutor)driver;
        	jse.executeScript("document.getElementById('i2').value='manager'");
        }
        
	}

}
