package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com");
  
        driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
        /*Thread.sleep(5000);
        String s="False";
        while(s=="False") {
        	if(driver.findElements(By.xpath("//div[@aria-label='Thu Nov 03 2022']//p[contains(@class,'todayPrice')][contains(text(),'₹ 6,843')]")).size()>0);
        	{
        		driver.findElement(By.xpath("//div[@aria-label='Thu Nov 03 2022']//p[contains(@class,'todayPrice')][contains(text(),'₹ 6,843')]")).click();
        		s="True";
        	}
        	else
        	{
        		Thread.sleep(5000);
        		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
        	
		}
      /* WebElement next = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
     
       next.click();
       next.click();
       next.click();*/
    
       Thread.sleep(5000);
      // WebElement date = driver.findElement(By.xpath("//div[text()='October 2022']"));
       //driver.findElement(By.xpath("//div[text()='October 2022']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='14']")).click();
	}

}
