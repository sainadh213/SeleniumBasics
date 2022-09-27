package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FutureDate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");

		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		
		for (int i = 0; i < 12; i++) 
		{
			
			try {
				driver.findElement(By.xpath("//div[@aria-label='Wed Nov 09 2022']")).click();
				break;
			} catch (Exception e) 
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}

	}

}
