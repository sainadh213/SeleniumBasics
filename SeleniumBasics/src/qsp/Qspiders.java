package qsp;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Qspiders {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.qspiders.com/");
		Thread.sleep(2000);
		Actions at=new Actions(driver);
		WebElement add=driver.findElement(By.xpath("//span[text()='Telangana']"));
		at.moveToElement(add).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Hyderabad - KPHB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='button is-persian is-small has-text-weight-semibold']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fas fa-user-plus fa-lg'])[3]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Your Mobile Number']")).sendKeys("7660853");
		TakesScreenshot sc=(TakesScreenshot)driver;
		File src=sc.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\SaiNadh\\OneDrive\\Desktop\\ScreenShots\\DefectSecreenshot.jpg");
		Files.copy(src, dest);
		//driver.findElement(By.xpath("//button[@class='modal-close is-large']")).click();
	//driver.findElement(By.xpath("//span[text()='Batches']")).click();
				//Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[@target='_blank']")).click();
		
	}

}
