package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lakshmi {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.CodeBunk.com/b/");
	WebElement text = driver.findElement(By.id("dn-inp"));
	Thread.sleep(4000);
	text.sendKeys("nagalakshmi");
	Thread.sleep(4000);
	driver.findElement(By.id("save-dn")).click();
}
}
