package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHTMLPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.cleartrip.com/flights");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@style='min-width: 250px;']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Sat Apr 30 2022']//div[text()=30]")).click();

	}

}
