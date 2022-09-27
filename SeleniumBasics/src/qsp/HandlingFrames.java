package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/SaiNadh/OneDrive/Desktop/username.html");
		Thread.sleep(2000);
		//driver.findElement(By.id("un")).sendKeys("admin");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("frid");
		//driver.switchTo().frame("frnm");
		WebElement add=driver.findElement(By.id("frid"));
		driver.switchTo().frame(add);
		Thread.sleep(2000);
		driver.findElement(By.id("pwd")).sendKeys("manager");
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("un")).sendKeys("admin");
		

	}

}
