package qsp;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Links {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).click();
		List<WebElement> lins = driver.findElements(By.tagName("a"));
		System.out.println(lins.size());
		int count=0;
		Thread.sleep(2000);
		for(WebElement s:lins)
		{
			count++;
			Thread.sleep(2000);
			String link = s.getAttribute("href");
			Thread.sleep(2000);
			driver.get(link);
		}
		System.out.println("Total Links Are :" +count);

}
}