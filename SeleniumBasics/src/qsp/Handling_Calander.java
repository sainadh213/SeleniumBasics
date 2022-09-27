package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Calander {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");

		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		for(int i=1;i<12;i++)
		{
			try {
				driver.findElement(By.xpath("//div[@aria-label='Thu Nov 03 2022']//p[contains(@class,'todayPrice')][contains(text(),'₹ 6,843')]")).click();
				break;
			} catch (Exception e) {
				Thread.sleep(5000);
              //driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
			//	driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//i[@class=\"wewidgeticon we_close\"]")).click();
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}

		

		}

	}




