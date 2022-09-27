package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Laptops");
       // Robot rb=new Robot();
        //rb.keyPress(KeyEvent.VK_ENTER);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
        Set<String> wins = driver.getWindowHandles();
        for(String siw:wins)
        {
        	driver.switchTo().window(siw);
        	String title = driver.getTitle();
        	System.out.println(title);
        	if(title.contains("dell"))
        	{
        		driver.switchTo().window(siw);
        		break;
        	}
        }
       WebElement price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
      System.out.println(price.getText()); 
      Thread.sleep(5000);
      driver.quit();
        
	}

	}


